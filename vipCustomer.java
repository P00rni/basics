
public class vipCustomer extends BankCustomer{

	vipCustomer(String name, int accno, int amount, String Address) {
		super(name, accno, amount, Address);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		BankCustomer vip1 = new vipCustomer ("ABC",111,1000,"Belfast");
		
		// Animal c  = new cat();
		
		// Cat c = new Cat();
	
		vip1.deposit(5000);
		vip1.checkBalance();
		
		
	
		
	}
	
	void issueCreditcard() {
		
	}
	
	
	

	
	

}
