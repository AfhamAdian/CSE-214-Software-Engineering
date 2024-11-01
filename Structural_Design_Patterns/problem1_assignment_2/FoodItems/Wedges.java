package FoodItems;


public class Wedges implements FoodItemInterface{
    protected float price;

    public Wedges( float price ){
        this.price = price;
    }

    public void setPrice( float price ){
        this.price = price;
    }

    @Override
    public String getItemName(){
        return "Wedges";
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
