package FoodItems;


public class Drinks implements FoodItemInterface{
    protected float price;

    public Drinks( float price ){
        this.price = price;
    }

    public void setPrice( float price ){
        this.price = price;
    }

    @Override
    public String getItemName(){
        return "Drinks";
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
