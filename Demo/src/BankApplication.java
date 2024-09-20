
public class BankApplication {

	int b = 100;
	int t ;
	
	
	public void deposit(int d ) {
		
		System.out.println("Deposit amount :" + d );
	
		System.out.println("Total amount :" + ( t = b + d) );
		
	}
    public int withdraw(int w) {
		
    	
		return t-w;
	}
   public void displaybalance() {
		
	   System.out.println("Current Balance :" + t );
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		
		BankApplication obj = new BankApplication();
		
		System.out.println(obj.b);
		
		 obj.deposit(100);  
		
		System.out.println("Widthdraw amount:"+ obj.withdraw(50));
		
		obj.displaybalance();
	
	}

}
