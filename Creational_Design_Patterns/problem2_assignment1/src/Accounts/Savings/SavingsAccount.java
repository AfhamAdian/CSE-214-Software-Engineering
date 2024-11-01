package Accounts.Savings;

import Accounts.Accounts;

public class SavingsAccount extends Accounts{
    
    @Override
    public void setRate(){
    }

    public void setInterestRate(float interestRate){
        super.setInterestRate(interestRate);
    }
    public void setAccountName(String accountName){
        super.setAccountName(accountName);
    }
}
