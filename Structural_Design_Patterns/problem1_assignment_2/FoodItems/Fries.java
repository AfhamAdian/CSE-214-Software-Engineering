package FoodItems;


public class Fries implements FoodItemInterface{
    protected float price;

    public Fries( float price ){
        this.price = price;
    }

    public void setPrice( float price ){
        this.price = price;
    }

    @Override
    public String getItemName(){
        return "Fries";
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
