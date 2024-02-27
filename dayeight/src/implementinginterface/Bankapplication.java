package implementinginterface;

public class Bankapplication {

	public static void main(String[] args) {
		Bank bank=new BankImpl();
		
		Account account=new Account(123456,"Mihir",15000,bank);
		
		 account.deposite(2000);
	     System.out.println(account);
	     
	    
	     account.withdraw(10000);
	     System.out.println(account);
	 }
}
