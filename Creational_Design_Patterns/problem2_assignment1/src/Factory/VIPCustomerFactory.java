package Factory;

import Accounts.Accounts;
import Accounts.Loan.*;
import Accounts.Savings.*;

public class VIPCustomerFactory implements AbstractFactory{
    
    @Override
    public Accounts getAccount(String accountType){
        if(accountType.equals("Savings")){
            return getSavingsAccount();
        }
        else if(accountType.equals("Loan")){
            return getLoanAccount();
        }
        return null;
    }

    private Accounts getSavingsAccount(){
        Accounts temp = new VIPSavingsAccounts();
        temp.setRate();
        temp.setAccountName("VIP Savings Account");
        return temp;
    }
    private Accounts getLoanAccount(){
        Accounts temp = new VIPLoanAccount();
        temp.setRate();
        temp.setAccountName("VIP Loan Account");
        return temp;
    }
}
