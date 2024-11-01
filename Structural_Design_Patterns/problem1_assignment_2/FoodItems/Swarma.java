package FoodItems;


public class Swarma implements FoodItemInterface{
    protected float price;

    public Swarma( float price ){
        this.price = price;
    }

    public void setPrice( float price ){
        this.price = price;
    }

    @Override
    public String getItemName(){
        return "Swarma";
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
