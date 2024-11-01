package Accounts.Savings;

public class VIPSavingsAccounts extends SavingsAccount{
    
    @Override
    public void setRate(){
        super.setInterestRate((float)5);
    }
    public void setAccountName(){
        super.setAccountName("VIPSavingsAccount");
    }
}
