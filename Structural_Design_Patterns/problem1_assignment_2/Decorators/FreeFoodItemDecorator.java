package Decorators;

import FoodItems.FoodItemInterface;

public class FreeFoodItemDecorator extends BaseDecorator{
    public FreeFoodItemDecorator(FoodItemInterface foodItem){
        super(foodItem);
    }

    @Override
    public String getItemName(){
        return super.getItemName()+"(Free!!!)";
    }

    @Override
    public float getItemPrice(){
        return 0;
    }   
}
