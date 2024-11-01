package FoodItems;


public class Burger implements FoodItemInterface{
    protected float price;

    public Burger(){
        this.price = 0;
    }
    
    public Burger( float price ){
        this.price = price;
    }

    public void setPrice( float price ){
        this.price = price;
    }

    @Override
    public String getItemName(){
        return "Burger";
    }

    @Override
    public float getItemPrice(){
        return price;
    }

    @Override
    public void printItems(){
        System.out.println( getItemName() + " - " + getItemPrice());
    }
}
