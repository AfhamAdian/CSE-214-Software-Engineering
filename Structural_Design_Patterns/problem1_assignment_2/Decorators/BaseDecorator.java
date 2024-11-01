package Decorators;

import FoodItems.FoodItemInterface;

public class BaseDecorator implements FoodItemInterface{
    protected FoodItemInterface foodItem;

    public BaseDecorator(FoodItemInterface foodItem){
        this.foodItem = foodItem;
    }

    @Override
    public String getItemName(){
        return foodItem.getItemName();
    }

    @Override
    public float getItemPrice(){
        return foodItem.getItemPrice();
    }

    @Override
    public void printItems(){
        foodItem.printItems();
    }
}
