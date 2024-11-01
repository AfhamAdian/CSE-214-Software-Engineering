package Accounts.Savings;

public class PremiumSavingsAccount extends SavingsAccount{
    
    @Override
    public void setRate(){
        super.setInterestRate((float)3.5);
    }
    public void setAccountName(){
        super.setAccountName("PremiumSavingsAccount");
    }
}
