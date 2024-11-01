package Accounts;

public abstract class Accounts{
    private String accountName;
    private float accountBalance;
    private float interestRate;
    
    abstract public void setRate();


    public String getAccountName(){
        return accountName;
    }
    public float getBalance(){
        return accountBalance;
    }
    public float getInterestRate(){
        return interestRate;
    }

    public void setAccountName(String accountName){
        this.accountName = accountName;
    }
    public void setInterestRate(float interestRate){
        this.interestRate = interestRate;
    }
    public void setBalance(float accountBalance){
        this.accountBalance = accountBalance;
    }

    //Essential Functions

    //Monthy interest calculation
    public float calculateInterestInAGivenPeriod(int period){
        return accountBalance*interestRate*period/100;
    }
    public float depositMoney(float amount){
        accountBalance += amount;
        return accountBalance;
    }
    public float withdrawMoney(float amount){
        accountBalance -= amount;
        return accountBalance;
    }
    public void display(){
        System.out.println("Account Name: "+accountName);
        System.out.println("Account Balance: "+accountBalance);
        System.out.println("Interest Rate: "+interestRate);
        System.out.println("Interest for 5 year deposit : "+ calculateInterestInAGivenPeriod(60));
    }
}
