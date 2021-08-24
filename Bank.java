
public class Bank {
	
	String bankName;
	
	String Address;
	
	int totalBalance;
	
	BankCustomer bankCustomer;  //
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		BankCustomer cus1 = new BankCustomer("Poornima",345,5000,"UK");
		
Bank iob = new Bank ("IOB","chennai",5000,new BankCustomer("Poornima",345,5000,"UK"));
Bank ICI = new Bank("ici","blr",100,cus1);
	}
	
	
	Bank(String bname,String addr,int totalbal,BankCustomer BC){  //constructor - same name as class
	
		this.bankName = bname;
		this.Address = addr;
		this.totalBalance = totalbal;
		this.bankCustomer=BC;
		
	}
	void loan() {
		
		
		
	}

}
