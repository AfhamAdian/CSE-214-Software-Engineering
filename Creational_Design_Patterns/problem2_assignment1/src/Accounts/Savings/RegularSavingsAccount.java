package Accounts.Savings;

public class RegularSavingsAccount extends SavingsAccount{
    
    @Override
    public void setRate(){
        super.setInterestRate((float)2.5);
    }
    public void setAccountName(){
        super.setAccountName("RegularSavingsAccount");
    }
}
