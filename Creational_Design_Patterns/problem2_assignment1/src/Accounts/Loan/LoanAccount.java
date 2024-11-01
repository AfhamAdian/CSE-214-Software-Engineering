package Accounts.Loan;

import Accounts.Accounts;

public class LoanAccount extends Accounts{
    
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
