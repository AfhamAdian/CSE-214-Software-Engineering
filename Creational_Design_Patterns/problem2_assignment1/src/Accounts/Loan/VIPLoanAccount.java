package Accounts.Loan;

public class VIPLoanAccount extends LoanAccount{
    
    @Override
    public void setRate(){
        super.setInterestRate((float)10);
    }
    public void setAccountName(){
        super.setAccountName("VIPLoanAccount");
    }
}
