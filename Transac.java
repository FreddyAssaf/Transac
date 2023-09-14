package Final_Project;
import java.io.*;
import java.util.*;
public class MainClass {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		ArrayList <Client>clients = new ArrayList<Client>();
		ArrayList <Supplier>suppliers = new ArrayList<Supplier>();
		ArrayList<Item>items = new ArrayList<Item>();
		ArrayList<Transaction>transactions = new ArrayList<Transaction>();
		List<String> temps = new ArrayList<String>();
		
		int choice = 0,choice1 = 0,choice2 = 0,choice3 = 0,choice4 = 0;
		do {
			System.out.println("Main Menu: ");
			System.out.print("1-Client\n2-Supplier\n3-Items\n4-Transaction\n9-Exit\nChoice: ");
			choice = sc.nextInt();
			sc.nextLine();
		
			switch(choice) {
			case 1:
				do {
					System.out.println("\nClient Menu:");
					System.out.print("1-New\n2-View\n3-Delete\n4-List\n9-Exit\nChoice: ");
					choice1 = sc.nextInt();
					sc.nextLine();
					}while(choice1<1 || choice1>4 && choice1<9);
					switch(choice1) {
					case 1:
											////////	Creating an object Client
						
						String CliName,CliPN;
						int CliId;
						double CliBal;
						System.out.println("Creating new client: ");
						System.out.print("1-Cient ID: ");
						CliId = sc.nextInt();
						sc.nextLine();
						System.out.print("2-Client Name: ");
						CliName = sc.nextLine();
						System.out.print("3-Client Phone Number: ");
						CliPN = sc.nextLine();
						System.out.print("4-Client Balance: ");
						CliBal = sc.nextDouble();
						sc.nextLine();
						System.out.println();
						Client c1 = new Client(CliId,CliPN,CliName,CliBal);
						clients.add(c1);
						
											///////////	Saving info in file Client
						
						File log1 = new File("D:\\Eclipse Workspace\\Final_Project\\Info\\Client");
						try {
							if(log1.exists()==false) {
								System.out.println("Created a new file\n");
								log1.createNewFile();
							}
							PrintWriter out = new PrintWriter(new FileWriter(log1, true));
							out.append(c1.getList()+"\n");
							out.close();
						}catch (IOException e) {
							System.out.println("An error occured");
							e.printStackTrace();
						}
						break;
					
					case 2:
						int choice6;
						Scanner inFile = new Scanner(new File("D:\\Eclipse Workspace\\Final_Project\\Info\\Client")); 
				        while (inFile.hasNext()) {
				           String token1 = inFile.nextLine();
				            temps.add(token1);
				        }
				        if(temps.size() == 0) {
				        	System.err.println("\nNothing to View!!!\n");
				        }
				        else {
				        do {
				        	System.out.print("Choose a number:(1 to "+(temps.size())+"): ");
				        	choice6 = sc.nextInt();
				        	sc.nextLine();
				        }while(choice6<1 || choice6>temps.size());
				        System.out.println("ID|Name|Phone Number|Balance");
				        System.out.println(temps.get(choice6-1));
				        }
				        temps.clear();
				        break;
					case 3:							////////////////////Delete client info from text file
						int del = 0;
						Scanner inFile1 = new Scanner(new File("D:\\Eclipse Workspace\\Final_Project\\Info\\Client")); 
				        while (inFile1.hasNext()) {
				           String token1 = inFile1.nextLine();
				            temps.add(token1);
				        }
				        if(temps.size() == 0)
				        	System.out.println("Nothing to delete....\n");
				        else {
					        do {
					        System.out.println("Enter the info needed to be deleted (1 to " +temps.size() + "):");
							del = sc.nextInt();
					        }while(del < 1 || del > temps.size());
				        
						temps.remove(del - 1);
						if(transactions.size() != 0)
							transactions.remove(del - 1);
						
						String st1 = "";
						for(String st:temps)
							st1+=st+"\n";
						
						try {
							  FileWriter writer = new FileWriter("D:\\Eclipse Workspace\\Final_Project\\Info\\Client", false);
							  writer.write(st1);
							  writer.close();
							} catch (IOException e) {
							  e.printStackTrace();
							} 
				        }
						temps.clear();
						break;
					case 4:
						///////////	Reading file
						System.out.println("ID|Name|Phone Number|Balance");
						Scanner read = new Scanner(new File("D:\\Eclipse Workspace\\Final_Project\\Info\\Client"));
						read.useDelimiter(",");
						
						while(read.hasNext()) {
							System.out.print(read.next());
						}
						read.close();
						System.out.println();
						break;
					case 9:
						System.out.println();
						break;
					default:
						System.out.println("Choice not found!\n");
					break;
					}
					
					break;
			case 2:
				do {
					System.out.println("\nSupplier Menu: ");
					System.out.println("1-New\n2-View\n3-Delete\n4-List\n9-Exit");
					choice2 = sc.nextInt();
					sc.nextLine();
				}while(choice2<1 || choice2>4 && choice2 <9);
				switch(choice2) {
				case 1:
					String SuppName,SuppPN;
					int SuppId;
					double SuppBal;
					System.out.println("Creating new Supplier: ");
					System.out.print("1-Supplier ID: ");
					SuppId = sc.nextInt();
					sc.nextLine();
					System.out.print("2-Supplier Name: ");
					SuppName = sc.nextLine();
					System.out.print("3-Supplier Phone Number: ");
					SuppPN = sc.nextLine();
					System.out.print("4-Supplier Balance: ");
					SuppBal = sc.nextDouble();
					sc.nextLine();
					System.out.println();
					Supplier s1 = new Supplier(SuppId,SuppPN,SuppName,SuppBal);
					suppliers.add(s1);
					
														///////////	Saving info in file Supplier

					File log1 = new File("D:\\Eclipse Workspace\\Final_Project\\Info\\Supplier");
					try {
						if(log1.exists()==false) {
							System.out.println("Created a new file\n");
							log1.createNewFile();
						}
						PrintWriter out = new PrintWriter(new FileWriter(log1, true));
						out.append(s1.getList()+"\n");
						out.close();
					}catch (IOException e) {
						System.err.println("An error occured");
						e.printStackTrace();
					}
					
					
					break;
				case 2:
					int choice6;
					Scanner inFile = new Scanner(new File("D:\\Eclipse Workspace\\Final_Project\\Info\\Supplier")); 
			        while (inFile.hasNext()) {
			           String token1 = inFile.nextLine();
			            temps.add(token1);
			        }
			        if(temps.size() == 0) {
			        	System.err.println("\nNothing to View!!!\n");
			        }
			        else {
			        do {
			        	System.out.print("Choose a number:(1 to "+(temps.size())+"): ");
			        	choice6 = sc.nextInt();
			        	sc.nextLine();
			        }while(choice6<1 || choice6>temps.size());
			        System.out.println("ID|Name|Phone|Balance");
			        System.out.println(temps.get(choice6-1) + "\n");
			        
			        }
			        temps.clear();
					break;
				case 3:
									////////////////////Delete Supplier info from text file
					int del = 0;
					Scanner inFile1 = new Scanner(new File("D:\\Eclipse Workspace\\Final_Project\\Info\\Supplier")); 
			        while (inFile1.hasNext()) {
			           String token1 = inFile1.nextLine();
			            temps.add(token1);
			        }
			        if(temps.size() == 0)
			        	System.out.println("Nothing to delete....\n");
			        else {
				        do {
				        System.out.println("Enter the info needed to be deleted (1 to " +temps.size() + "):");
						del = sc.nextInt();
				        }while(del < 1 || del > temps.size());
			        
					temps.remove(del - 1);
					if(transactions.size() != 0)
						transactions.remove(del - 1);
					
					String st1 = "";
					for(String st:temps)
						st1+=st+"\n";
					
					try {
						  FileWriter writer = new FileWriter("D:\\Eclipse Workspace\\Final_Project\\Info\\Supplier", false);
						  writer.write(st1);
						  writer.close();
						} catch (IOException e) {
						  e.printStackTrace();
						} 
			        }
					temps.clear();
					break;
				case 4:
												///////////	Reading file
					
					System.out.println("ID Name Phone Balance");
					Scanner read = new Scanner(new File("D:\\Eclipse Workspace\\Final_Project\\Info\\Supplier"));
					read.useDelimiter(",");
					
					while(read.hasNext()) {
						System.out.print(read.next());
					}
					read.close();
					System.out.println();
					break;
				case 9:
					System.out.println();
					break;
				default:
					System.err.println("Choice not found!\n");
				break;
				}
				break;
			case 3:
				do {
					System.out.println("\nItem Menu: ");
					System.out.println("1-New\n2-View\n3-Delete\n4-List\n9-Exit");
					choice3 = sc.nextInt();
					sc.nextLine();
				}while(choice3<1 || choice3>4 && choice3<9);
				switch(choice3) {
				case 1:
					String itemName;
					int itemId,itemQuantity;
					double itemBuyPrice,itemSellPrice;
					System.out.println("Creating new item: ");
					System.out.print("1-Item ID: ");
					itemId = sc.nextInt();
					sc.nextLine();
					System.out.print("2-Item Name: ");
					itemName= sc.nextLine();
					System.out.print("3-Item Quantity: ");
					itemQuantity = sc.nextInt();
					System.out.print("4-Unit Price: ");
					itemBuyPrice = sc.nextDouble();
					System.out.print("5-Sale Price: ");
					itemSellPrice = sc.nextDouble();
					sc.nextLine();
					System.out.println();
					Item it1 = new Item(itemName,itemId,itemQuantity,itemBuyPrice,itemSellPrice);
					
					/////////setting unitValue,saleValue,totalValue
					it1.setBuyBal();
					it1.setSellBal();
					it1.setTotalBal();
					items.add(it1);
									///////////	Saving info in file Item
				
					File log1 = new File("D:\\Eclipse Workspace\\Final_Project\\Info\\Item");
					try {
						if(log1.exists()==false) {
							System.out.println("Created a new file\n");
							log1.createNewFile();
						}
						PrintWriter out = new PrintWriter(new FileWriter(log1, true));
						out.append(it1.getList()+"\n");
						out.close();
					}catch (IOException e) {
						System.out.println("An error occured");
						e.printStackTrace();
					}
					break;
				case 2:
					//////// VIEW 
					int choice6;
					Scanner inFile = new Scanner(new File("D:\\Eclipse Workspace\\Final_Project\\Info\\Item")); 
			        while (inFile.hasNext()) {
			           String token1 = inFile.nextLine();
			            temps.add(token1);
			        }
			        if(temps.size() == 0) {
			        	System.err.println("\nNothing to View!!!\n");
			        }
			        else {
			        do {
			        	System.out.print("Choose a number:(1 to "+(temps.size())+"): ");
			        	choice6 = sc.nextInt();
			        	sc.nextLine();
			        }while(choice6<1 || choice6>temps.size());
			        System.out.println("ID|Name|Quantity|Unit Price|Total Units|Sale Value|Total Sales|Total");
			        System.out.println(temps.get(choice6-1));
			        }
			        temps.clear();
					break;
				case 3:
								////////////////////Delete Item info from text file
					int del = 0;
					Scanner inFile1 = new Scanner(new File("D:\\Eclipse Workspace\\Final_Project\\Info\\Item")); 
			        while (inFile1.hasNext()) {
			           String token1 = inFile1.nextLine();
			            temps.add(token1);
			        }
			        if(temps.size() == 0)
			        	System.out.println("Nothing to delete....\n");
			        else {
				        do {
				        System.out.println("Enter the info needed to be deleted (1 to " +temps.size() + "):");
						del = sc.nextInt();
				        }while(del < 1 || del > temps.size());
			        
					temps.remove(del - 1);
					if(transactions.size() != 0)
						transactions.remove(del - 1);
					
					String st1 = "";
					for(String st:temps)
						st1+=st+"\n";
					
					try {
						  FileWriter writer = new FileWriter("D:\\Eclipse Workspace\\Final_Project\\Info\\Item", false);
						  writer.write(st1);
						  writer.close();
						} catch (IOException e) {
						  e.printStackTrace();
						} 
			        }
					temps.clear();
					break;
				case 4:
							///////////	Reading file
							
					System.out.println("ID|Name|Quantity|Unit Price|Total Units|Sale Value|Total Sales|Total");
					Scanner read = new Scanner(new File("D:\\Eclipse Workspace\\Final_Project\\Info\\Item"));
					read.useDelimiter(",");
					
					while(read.hasNext()) {
						System.out.print(read.next());
					}
					read.close();
					System.out.println();
					break;
				case 9:
					System.out.println();
					break;
				default:
					System.err.println("Choice not found!\n");
				break;
				}
				break;
			case 4:
				String transType;
				do {
					System.out.println("\nTransaction Menu: ");
					System.out.print("1-New\n2-View\n3-Delete\n4-List\n9-Exit\nChoice: ");
					choice4 = sc.nextInt();
					sc.nextLine();
				}while(choice4<1 || choice4>4 && choice4<9);
				switch(choice4) {
				case 1:		//NEW TRANSACTION
					int transId,itemQty,item;
					String transDate;
					float price;
					File log1 = new File("D:\\Eclipse Workspace\\Final_Project\\Info\\Trans");
					System.out.print("\n1-Purchase\n2-Sale\nChoice: ");
					int choice5 = sc.nextInt();
					sc.nextLine();
					switch(choice5) {
					case 1:		//PURCHASE TRANSACTION
						transType = "Purchase";
						System.out.println("\nCreating New Purchase Transaction: ");
						System.out.print("1-Transaction ID: ");
						transId = sc.nextInt();
						sc.nextLine();
						System.out.print("2-Transaction Date: ");
						transDate = sc.nextLine();
						System.out.print("3-Item ID: ");
						item = sc.nextInt();
						sc.nextLine();
						System.out.print("4-Quantity Purchased: ");
						itemQty = sc.nextInt();
						sc.nextLine();
						System.out.print("5-Unit Price: ");
						price = sc.nextFloat();
						sc.nextLine();
						System.out.println();
						Transaction t1 = new Transaction(transType,transDate,transId,item,price,itemQty);
						transactions.add(t1);
						
						
						try {
							if(log1.exists()==false) {
								System.out.println("Created a new file\n");
								log1.createNewFile();
							}
							PrintWriter out = new PrintWriter(new FileWriter(log1, true));
							out.append(t1.getList()+"\n");
							out.close();
						}catch (IOException e) {
							System.err.println("An error occured");
							e.printStackTrace();
						}
						break;
					case 2:		//SALE TRANSACTION
						transType = "Sale";
						System.out.println("\nCreating New Sale Transaction: ");
						System.out.print("1-Transaction ID: ");
						transId = sc.nextInt();
						sc.nextLine();
						System.out.print("2-Transaction Date: ");
						transDate = sc.nextLine();
						System.out.print("3-Item ID: ");
						item = sc.nextInt();
						sc.nextLine();
						System.out.print("4-Quantity Sold: ");
						itemQty = sc.nextInt();
						sc.nextLine();
						System.out.print("5-Sale Price: ");
						price = sc.nextFloat();
						sc.nextLine();
						System.out.println();
						Transaction t2= new Transaction(transType,transDate,transId,item,price,itemQty);
						transactions.add(t2);
						 				
						try {
							if(log1.exists()==false) {
								System.out.println("Created a new file\n");
								log1.createNewFile();
							}
							PrintWriter out = new PrintWriter(new FileWriter(log1, true));
							out.append(t2.getList()+"\n");
							out.close();
						}catch (IOException e) {
							System.err.println("An error occured");
							e.printStackTrace();
						}
						
						
						break;
					}
					break;
				case 2:		//VIEW 
					int choice6;
					Scanner inFile = new Scanner(new File("D:\\Eclipse Workspace\\Final_Project\\Info\\Trans")); 
			        while (inFile.hasNext()) {
			           String token1 = inFile.nextLine();
			            temps.add(token1);
			        }
			        if(temps.size() == 0) {
			        	System.err.println("\nNothing to View!!!\n");
			        }
			        else {
			        do {
			        	System.out.println("Choose a number:(1 to "+(temps.size())+"): ");
			        	choice6 = sc.nextInt();
			        	sc.nextLine();
			        }while(choice6<1 || choice6>temps.size());
			        System.out.println("Transaction Type|ID|Date|Quantity|Price");
			        System.out.println(temps.get(choice6 - 1) + "\n");
			        }
			        temps.clear();
					break;
				case 3:
							////////////////////Delete transaction info from text file
					int del = 0;
					Scanner inFile1 = new Scanner(new File("D:\\Eclipse Workspace\\Final_Project\\Info\\Trans")); 
			        while (inFile1.hasNext()) {
			           String token1 = inFile1.nextLine();
			            temps.add(token1);
			        }
			        if(temps.size() == 0)
			        	System.out.println("Nothing to delete....\n");
			        else {
				        do {
				        System.out.println("Enter the info needed to be deleted (1 to " +temps.size() + "):");
						del = sc.nextInt();
				        }while(del < 1 || del > temps.size());
			        
					temps.remove(del - 1);
					if(transactions.size() != 0)
						transactions.remove(del - 1);
					
					String st1 = "";
					for(String st:temps)
						st1+=st+"\n";
					
					try {
						  FileWriter writer = new FileWriter("D:\\Eclipse Workspace\\Final_Project\\Info\\Trans", false);
						  writer.write(st1);
						  writer.close();
						} catch (IOException e) {
						  e.printStackTrace();
						} 
			        }
					temps.clear();
			        
					break;
				case 4:
					///////////	Reading file
					
					System.out.println("\nTransaction Type|ID|Date|Quantity|Price");
					Scanner read = new Scanner(new File("D:\\Eclipse Workspace\\Final_Project\\Info\\Trans"));
					read.useDelimiter(",");
					while(read.hasNext()) {
						System.out.print(read.next());
					}
					read.close();
					System.out.println();
					break;
				case 9:
					System.out.println();
					break;
				default:
					System.err.println("Choice not found!\n");
				break;
				}
				
				break;
			}
		}while(choice != 9);
	}
}
