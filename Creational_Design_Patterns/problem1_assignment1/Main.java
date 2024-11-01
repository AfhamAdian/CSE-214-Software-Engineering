import java.util.Scanner;

import Builders.*;
import ComponentsClass.TicketingSystem.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String packageName;
        String webServerName;
        String connectionTypeName;

        System.out.println("Select Package: ");
        System.out.println("1. Basic\n2. Standard\n3. Advanced\n4. Premium");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                packageName = "Basic";
                break;
            case 2:
                packageName = "Standard";
                break;
            case 3:
                packageName = "Advanced";
                break;
            case 4:
                packageName = "Premium";
                break;
            default:
                packageName = "Basic";
        }


        System.out.println("Select Web Server: ");
        System.out.println("1. NodeJs\n2. Django\n3. Ruby");
        choice = scanner.nextInt();
        switch(choice){
            case 1:
                webServerName = "NodeJs";
                break;
            case 2:
                webServerName = "Django";
                break;
            case 3:
                webServerName = "Ruby";
                break;
            default:
                webServerName = "NodeJs";
        }


        System.out.println("Select Connection Type: ");
        System.out.println("1. Wifi\n2. GSM");
        if(packageName.equalsIgnoreCase("Advanced") || packageName.equalsIgnoreCase("Premium")){
            System.out.println("3. Ethernet");
        }
        choice = scanner.nextInt();
        switch(choice){
            case 1:
                connectionTypeName = "Wifi";
                break;
            case 2:
                connectionTypeName = "GSM";
                break;
            case 3:
                connectionTypeName = "Ethernet";
                break;
            default:
                connectionTypeName = "Wifi";
        }
        
        Director director = new Director();
        TicketingSystem ticketingSystem = director.prepareChoices(packageName, webServerName, connectionTypeName);

        System.out.println(ticketingSystem);

        //payment part
        while(true){
            System.out.println("Enter Your Choice : ");
            System.out.println("    1. Deposit\n    2. Withdraw\n    3. Exit");
            choice = scanner.nextInt();
            switch( choice ){
                case 1:
                    System.out.println("Enter Amount to Deposit : ");
                    int amount = scanner.nextInt();
                    ticketingSystem.getPaymentTerminal().addMoney(amount);
                    System.out.println("Account Balance : " + ticketingSystem.getPaymentTerminal().getStoredAmount());
                    break;
                case 2:
                    System.out.println("Enter Amount to Withdraw : ");
                    amount = scanner.nextInt();
                    ticketingSystem.getPaymentTerminal().deductMoneyForTicket(amount);
                    System.out.println("Account Balance : " + ticketingSystem.getPaymentTerminal().getStoredAmount());
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
        
    }
}