//package ATM;
//import java.util.Scanner;
//public class Main {
//
//	public static void main(String[] args) 
//	{
//          ATM_Card card = null;
//        
//        // Card selection
//		Scanner s=new Scanner(System.in);
//        System.out.println("Select your bank card:");
//        System.out.println("1. HDFC Bank");
//        System.out.println("2. Kotak Bank");
//        System.out.println("3. SBI Bank");
//        System.out.print("Enter choice ");
//        int bankChoice = s.nextInt();
//        
//        switch(bankChoice) {
//            case 1: card = new HDFCBankCard(); 
//            break;
//            case 2: card = new KOTAKBankCard(); 
//            break;
//            case 3: card = new SBIBankCard(); 
//            break;
//            default: 
//                System.out.println("Invalid bank selection!");
//                System.exit(0);
//        }
//        
//        // ATM Operations
//        for(;;) {
//            System.out.println("\nATM Menu:");
//            System.out.println("1. Deposit");
//            System.out.println("2. Withdraw");
//            System.out.println("3. Balance Enquiry");
//            System.out.println("4. Exit");
//            System.out.print("Enter your choice: ");
//            int option = s.nextInt();
//            
//            switch(option) {
//                case 1: // Deposit
//                    try {
//                        System.out.print("Enter amount to deposit: ");
//                        double depositAmt = s.nextDouble();
//                        card.deposit(depositAmt);
//                    } catch(NegativeAmountException e) {
//                        System.out.println("Error: " + e.getMessage());
//                    }
//                    break;
//                    
//                case 2: // Withdraw
//                    try {
//                        System.out.print("Enter amount to withdraw: ");
//                        double withdrawAmt = s.nextDouble();
//                        card.withdraw(withdrawAmt);
//                    } catch(NegativeAmountException | InsufficientFundException e) {
//                        System.out.println("Error: " + e.getMessage());
//                    }
//                    break;
//                    
//                case 3: // Balance Enquiry
//                    card.CurrentBalance();
//                    break;
//                    
//                case 4: // Exit
//                	System.out.println("*************************************");
//                    System.out.println("*     Thank you for using our ATM    *");
//                    System.out.println("**************************************");
//                    s.close();
//                    System.exit(0);
//                    
//                default:
//                    System.out.println("Invalid option! Try again.");
//            }
//        }
//    }
//
//  }
