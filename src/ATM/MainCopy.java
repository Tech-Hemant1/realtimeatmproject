//For run-->Package.ClassName(ex-ATM.HDFCBankCard)
package ATM;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.reflect.InvocationTargetException;
public class MainCopy {
	@SuppressWarnings("Deprecation")
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException 
	{
		Scanner scn=new Scanner(System.in);
		while(true)
		{
			System.out.println("Insert Card");
			String cardName=scn.nextLine();
			try
			{
				Class cls = Class.forName(cardName);
				Object  obj=cls.newInstance();
				System.out.println(cardName+" class is loaded and instantiated");
				ATM_Card card= (ATM_Card)obj;
				System.out.println("Card reading is completed successfully");
				System.out.println("Start Transaction");
				optionsloop: while(true)
				{
					System.out.println("\nChoose Option");
					System.out.println("1.Deposit");
					System.out.println("2.Withdraw");
					System.out.println("3.BalanceEnquiry");
					System.out.println("4.Exit");
					System.out.println("Enter Option Number");
					int option=scn.nextInt();scn.nextLine();
					switch(option)
					{
					case 1:
					{
						while(true)
						{	
							try
							{	
								System.out.println("Enter Amount to deposit: ");
								double amt=scn.nextDouble();scn.nextLine();
								card.deposit(amt);
								break;
							}catch(InputMismatchException e)
							{
								System.out.println("Error: Enter only number");
								scn.nextLine();
							}catch(NegativeAmountException e)
							{
								System.out.println("Error="+e.getMessage());
							}
						}
						break;
					}
					case 2:
					{
						while(true)
						{
							try
							{
								System.out.println("Enter Mount to withdraw");
								double amt=scn.nextDouble();scn.nextLine();
								card.withdraw(amt);
								break;
							}catch(InputMismatchException e)
							{
								System.out.println("Error:Enter only number");
								scn.nextLine();
							}catch(NegativeAmountException e)
							{
								System.out.println("Error:"+e.getMessage());
							}catch(InsufficientFundException e)
							{
								System.out.println("Error:"+e.getMessage());
								break;
							}
						}
					}
					break;
					case 3:
					{
						card.CurrentBalance();
						break;
					}
					case 4:
					{
						System.out.println("\n(Thank you for using our ATM),Take Card");
						break optionsloop;
					}
					default:
					{
						System.out.println("Invalid Option,Choose correct option");
					}
					}//switch close
			  }//option loop close
			}catch(ClassNotFoundException e)
				{
					System.out.println(cardName+" class file is not found");
				}catch(InstantiationException e)
				{
					System.out.println(cardName+" class does not contain no-param constructor");
				}catch(IllegalAccessException e)
				{
					System.out.println(cardName+" class does not contain visible no-param constructor");
				}catch(ClassCastException e)
				{
					System.out.println("invalid card");
				}
		}//opter while close
	}//main close
}//class close
