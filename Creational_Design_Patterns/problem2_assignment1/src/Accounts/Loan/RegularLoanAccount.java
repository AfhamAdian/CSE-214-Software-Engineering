package Accounts.Loan;

public class RegularLoanAccount extends LoanAccount{
    
    @Override
    public void setRate(){
        super.setInterestRate((float)12);
    }
    public void setAccountName(){
        super.setAccountName("RegularLoanAccount");
    }
}
