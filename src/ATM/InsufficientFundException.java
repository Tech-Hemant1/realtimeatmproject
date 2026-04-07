package ATM;

public class InsufficientFundException extends Exception 
{
	InsufficientFundException()
	{
		super();
	}
	InsufficientFundException(String errMsg)
	{
		super(errMsg);
	}
}
