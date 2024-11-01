import java.util.Scanner;

import Accounts.Accounts;
import Factory.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        String choiceName;

        System.out.println("Enter Your Customer Type : ");
        System.out.println("    1. Regular\n    2. Premium\n    3. VIP");
        choice = sc.nextInt();
        switch( choice ){
            case 1:
                choiceName = "Regular";
                break;
            case 2:
                choiceName = "Premium";
                break;
            case 3:
                choiceName = "VIP";
                break;
            default:
                choiceName = "";
        }

        //Selects the factory for the customer type
        AbstractFactory factory = FactoryProducer.getFactory(choiceName);

        System.out.println("Enter Your Account Type : ");
        System.out.println("    1. Savings\n    2. Loan");
        choice = sc.nextInt();
        switch( choice ){
            case 1:
                choiceName = "Savings";
                break;
            case 2:
                choiceName = "Loan";
                break;
            default:
                System.out.println("Invalid Input");
        }

        // Creates Account make per AccountType
        Accounts account = factory.getAccount(choiceName);
        
        while(true){
            System.out.println("Enter Your Choice : ");
            System.out.println("    1. Deposit\n    2. Withdraw\n    3. Display Details\n    4. Calculate Interest\n    5. Exit");
            choice = sc.nextInt();
            switch( choice ){
                case 1:
                    System.out.println("Enter Amount to Deposit : ");
                    double amount = sc.nextDouble();
                    account.depositMoney((float)amount);
                    break;
                case 2:
                    System.out.println("Enter Amount to Withdraw : ");
                    amount = sc.nextDouble();
                    account.withdrawMoney((float)amount);
                    break;
                case 3:
                    account.display();
                    break;
                case 4:
                    System.out.println("Enter Period : ");
                    int period = sc.nextInt();
                    System.out.println("Interest for "+period+" year deposit : "+ account.calculateInterestInAGivenPeriod(period));
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}