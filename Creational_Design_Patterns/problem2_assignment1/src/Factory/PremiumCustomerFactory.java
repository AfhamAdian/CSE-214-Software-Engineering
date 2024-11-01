package Factory;

import Accounts.Accounts;
import Accounts.Loan.*;
import Accounts.Savings.*;

public class PremiumCustomerFactory implements AbstractFactory{
    
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
        Accounts temp = new PremiumSavingsAccount();
        temp.setRate();
        temp.setAccountName("Premium Savings Account");
        return temp;
    }
    private Accounts getLoanAccount(){
        Accounts temp = new PremiumLoanAccount();
        temp.setRate();
        temp.setAccountName("Premium Loan Account");
        return temp;
    }
}
