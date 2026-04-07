package ATM;

public interface ATM_Card 
{
	void deposit(double amt) throws NegativeAmountException;
	void withdraw(double amt) throws NegativeAmountException,InsufficientFundException;
	void CurrentBalance();
}
