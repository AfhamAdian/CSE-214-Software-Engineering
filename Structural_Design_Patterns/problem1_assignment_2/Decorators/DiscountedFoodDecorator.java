package Decorators;

import FoodItems.FoodItemInterface;

public class DiscountedFoodDecorator extends BaseDecorator{
    private float discount;

    public DiscountedFoodDecorator(FoodItemInterface foodItem, float discount){
        super(foodItem);
        this.discount = discount;
    }

    @Override
    public String getItemName(){
        return super.getItemName();
    }

    @Override
    public float getItemPrice(){
        return super.getItemPrice() - discount*super.getItemPrice()/100;
    }  
    
    @Override
    public void printItems(){
        super.printItems();
        
        System.out.println("\nTotal - "+ getItemPrice()/(1-discount/100));
        System.out.println("Discount - "+ discount + "%");
        System.out.println("Discounted total - "+ getItemPrice());
    }
}
