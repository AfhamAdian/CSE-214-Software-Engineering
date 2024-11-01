package Factory;

import Accounts.Accounts;
import Accounts.Loan.*;
import Accounts.Savings.*;

public class RegularCustomerFactory implements AbstractFactory{
    
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
        Accounts temp = new RegularSavingsAccount();
        temp.setRate();
        temp.setAccountName("Regular Savings Account");
        return temp;
    }
    private Accounts getLoanAccount(){
        Accounts temp = new RegularLoanAccount();
        temp.setRate();
        temp.setAccountName("Regular Loan Account");
        return temp;
    }
}
