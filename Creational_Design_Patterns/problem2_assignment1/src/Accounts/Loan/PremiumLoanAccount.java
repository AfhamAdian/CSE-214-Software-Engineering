package Accounts.Loan;

public class PremiumLoanAccount extends LoanAccount{
    
    @Override
    public void setRate(){
        super.setInterestRate((float)14);
    }
    public void setAccountName(){
        super.setAccountName("PremiumLoanAccount");
    }
}
