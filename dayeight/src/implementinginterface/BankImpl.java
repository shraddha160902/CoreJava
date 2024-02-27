package implementinginterface;

public class BankImpl implements Bank{
	@Override
	 
	public void deposite(Account account,double amount) {
		 if (amount > deposite_limit)
				System.err.println("Deposit not possible.. exceeds Deposit Limit");
			else
				account.setBalance(account.getBalance()+amount);
	     System.out.println("Deposited " + amount + " into account: " + account.getAccNo());
	 }

	 @Override
	 
	 public void withdraw(Account account, double amount) {
		 if (account.getBalance() - amount >=  min_balance)
		 {
				account.setBalance(account.getBalance()-amount);
				System.out.println("Withdrawn " + amount + " from account: " + account.getAccNo());
		 }
		 else
			 System.out.println("Insufficient balance in account: " + account.getAccNo());
	 }
	
}
