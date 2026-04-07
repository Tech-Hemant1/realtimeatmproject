package ATM;

public  class HDFCBankCard implements ATM_Card
{
	private double balance;
	public void deposit(double amt) throws NegativeAmountException 
	{
		if(amt<0)
		{
			throw new NegativeAmountException("Do not pass -ve & zero");
		}
		balance+=amt;
		System.out.println("Amount is credited="+balance);
	}
	public void withdraw(double amt) throws NegativeAmountException,InsufficientFundException
	{
		if(amt<0)
		{
			throw new NegativeAmountException("Do not pass -ve & zero");
		}
		if(amt>balance)
		{
			throw new InsufficientFundException("Insufficient Balance");
		}
		balance-=amt;
		System.out.println("Amount is debited="+balance);
		
	}
	public void  CurrentBalance()
	{
		System.out.println("HDFC Bank Account Balance="+balance);
	}	
}
