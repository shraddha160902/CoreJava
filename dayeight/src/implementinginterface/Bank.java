package implementinginterface;

public interface Bank {

	double min_balance=1000;
	double deposite_limit=2500;
	double interest_rate=8.0;
	
	void deposite(Account account,double amount);
	void withdraw(Account account ,double amount);
}
