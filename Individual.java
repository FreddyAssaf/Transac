package Final_Project;

public class Individual implements Trait {
	private int id;
	private String name,phoneNum;
	private double balance;
	
	public Individual() {
		
	}
	public Individual(int id,String phoneNum,String name,double balance) {
		if(this.id>=0)
			this.id = id;
		else
			this.id=0;
		this.phoneNum=phoneNum;
		this.name=name;
		if(this.balance<0)
			this.balance = 0;
		else
			this.balance = balance;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(this.id>0)
			this.id = id;
		else
			System.out.println("Error Invalid information!");
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum=phoneNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return this.balance;
	}
	public void setBalance(double bal) {
		if(this.balance<0)
			this.balance = 0;
		else
			this.balance = bal;
	}
	public String getList() {
		return this.id +", "+this.name+", "+this.phoneNum + ", "+ this.balance;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
