
public class BankCustomer {
	//collection of all the 
	
	String name ;
	int accountNo;
	int amount;
	String address;//global.class or instance variables 
	
	static String bankName="ICIC Bank"; // remains same for all objects
	
	

	public static void main(String[] args) {
		
		BankCustomer cus1 = new BankCustomer("Poornima",345,5000,"UK");//poornima is obj
		
		BankCustomer cus2 = new BankCustomer("santhan",342,5000,"India");//poornima is obj
		
		System.out.println(bankName);
		System.out.println(cus1.amount);
		
		cus1.deposit(5000);
		
		
		
		
		
		cus1.withdraw(100);
		
		
		cus1.checkBalance();
		//getBankName(); // static method
		
		
		

	}
	
	BankCustomer(String name,int accno,int amount,String Address){  //constructor - same name as class
		int i ;
		this.name=name;
		this.accountNo=accno;
		this.amount=amount;
		this.address=address;
		
	}
	
	
	public void deposit(int dAmount){//local variables can b called only within this fun
		
		int i;
		amount = amount + dAmount;
		
}
	
	public void withdraw(int wAmount){
		if(wAmount<this.amount)
		{
		this.amount = this.amount-wAmount;//this keywork to call global variable
		}
		else
		{
			System.out.println("withdrawal amount exceeded");
		}
	}
	
	public int checkBalance(){
		System.out.println("Your current Balance is "+this.amount);
		
		return this.amount;
		
	}
	
	static String getBankName(Bank b) { // shouldnt use non static variables in static method
		
		
		
		//return b.bankName;
	}

}
