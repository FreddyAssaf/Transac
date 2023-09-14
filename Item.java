package Final_Project;
import java.text.NumberFormat;
public class Item {
	private int id,quantity ;
	private double buyPrice  ,sellPrice ,buyVal ,sellVal ,totalVal ;
	private String name;
	NumberFormat fmt = NumberFormat.getCurrencyInstance();
	
	public Item() {
		
	}
	public Item(String name,int id,int quantity,double buyPrice,double sellPrice) {
		if(id>=0)
			this.id = id;
		else
			this.id=0;
		
		this.name = name;
		 
		 if(buyPrice>=0)
			 this.buyPrice = buyPrice;
		 else
			 this.buyPrice = 0;
		 
		 if(sellPrice>=0)
			 this.sellPrice = sellPrice;
		 else
			 this.sellPrice = 0;
		 
		 if(quantity>=0)
			 this.quantity = quantity;
		 else
			 this.quantity = 0;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(this.id>=0)
			this.id = id;
		else
			System.out.println("Error, ID can't be negative!");
	}
	public double getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(double buyPrice) {
		if(this.buyPrice>=0)
			 this.buyPrice = buyPrice;
		 else
			 System.out.println("Error, Price can't be negative!");
	}
	public double getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(double sellPrice) {
		if(this.sellPrice>=this.buyPrice)
			 this.sellPrice = sellPrice;
		 else
			 System.out.println("Error, Price is lower than buy price");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(this.quantity > 0)
			this.quantity = quantity;
		else
			System.err.println("Error, Invalid quantity input!!!");
	}
	public void setBuyBal() {
		 this.buyVal = this.quantity*this.buyPrice;
	}
	public void setSellBal() {
		 this.sellVal = this.quantity * this.sellPrice;
	}
	public void setTotalBal() {
		 this.totalVal = this.sellVal - this.buyVal;
	}
	public String getList() {
		return this.id+", "+this.name+", "+this.quantity+", "+this.buyPrice+", "+this.buyVal+", "+this.sellPrice+", "+this.sellVal+", "+this.totalVal;
	}
	public String toString() {
		return "Item info: \nItem Name: " + name + "\nItem Id: " + id + "\nItem Quantity: " + this.quantity +  "\nItem Price Bought: " + fmt.format(buyPrice) + "\nItem Price Sold: " + fmt.format(sellPrice) 
			+ "\nItem Buy Balance: " + fmt.format(buyVal) + "\nItem Sell Balance: " + fmt.format(sellVal) + "\nItem Total Balance: " + fmt.format(totalVal); 
		
	}
}
