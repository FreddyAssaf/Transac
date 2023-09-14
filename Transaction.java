package Final_Project;

public class Transaction implements Trait{
		private String transType,transDate;
		private int transId,itemId,itemQty;
		private float price;
		public Transaction(String transType,String transDate,int transId,int itemId,float price,int itemQty) {
			this.transDate = transDate;
			this.transType = transType;
			if(transId > 0)
				this.transId = transId;
			if(itemId > 0)
				this.itemId = itemId;
			if(price > 0)
				this.price = price;
			if(itemQty > 0)
				this.itemQty = itemQty;
		}

		public int getItemId() {
			return itemId;
		}

		public void setItemId(int itemId) {
			if(this.itemId > 0)
				this.itemId = itemId;
			else
				System.err.println("Error, Invalid item ID!!!");
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			if(this.price > 0)
				this.price = price;
			else
				System.err.println("Error, Invalid Price!!!");
		}

		public int getItemQty() {
			return itemQty;
		}

		public void setItemQty(int itemQty) {
			if(this.itemQty > 0)
				this.itemQty = itemQty;
			else
				System.err.println("Error, Invalid item Quantity!!!");
			}

		public String getTransType() {
			return transType;
		}

		public void setTransType(String transType) {
			this.transType = transType;
		}

		public String getTransDate() {
			return transDate;
		}

		public void setTransDate(String transDate) {
			this.transDate = transDate;
		}

		public int getTransId() {
			return transId;
		}

		public void setTransId(int transId) {
			if(this.transId > 0)
				this.transId = transId;
			else
				System.err.println("Error, Invalid ID number entered!");
		} 
		public String getList() {
			return transType + ", " + transId + ", " + transDate + ", " + itemId + ", " + itemQty + ", " + price;
		}
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

