package ComponentsClass.PaymentTerminal;

public class PaymentTerminal {
    Integer storedAmount = 0;
    
    public void addMoney(Integer amount){
        storedAmount += amount;
    }
    public void deductMoneyForTicket(Integer amount){
        storedAmount -= amount;
    }
    public Integer getStoredAmount(){
        return storedAmount;
    }
}