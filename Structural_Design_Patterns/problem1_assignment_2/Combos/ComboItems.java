package Combos;

import java.util.*;

import FoodItems.FoodItemInterface;

public class ComboItems implements FoodItemInterface{
    private ArrayList<FoodItemInterface> foodItems = new ArrayList<FoodItemInterface>();
    private String comboName;

    public ComboItems( String comboName ){
        this.comboName = comboName;
    }

    public ComboItems( ArrayList<FoodItemInterface> foodItems ){
        this.foodItems = foodItems;
    }

    public void setFoodItems( ArrayList<FoodItemInterface> foodItems ){
        this.foodItems = foodItems;
    }

    public ComboItems addFoodItem( FoodItemInterface foodItem ){
        foodItems.add( foodItem );
        return this;
    }

    public ComboItems removeFoodItem( FoodItemInterface foodItem ){
        foodItems.remove( foodItem );
        return this;
    }

    public ComboItems removeFoodItemByName( String foodItemName ){
        for (FoodItemInterface foodItem : foodItems) {
            if( foodItem.getItemName().equalsIgnoreCase(foodItemName) ){
                foodItems.remove(foodItem);
                break;
            }
        }
        return this;
    }



    public FoodItemInterface getFoodItems(String FoodItemName){
        for (FoodItemInterface foodItem : foodItems) {
            if (foodItem.getItemName().equalsIgnoreCase(FoodItemName)) {
                return foodItem;
            }
        }
        return null;
    }

    @Override 
    public String getItemName(){
        String name = comboName + "(";
        int count = 1;
        for (FoodItemInterface foodItem : foodItems) {
            if( count == foodItems.size() )
                name += foodItem.getItemName() + ")";
            else 
                name += foodItem.getItemName() + "+";
            count++;
        }
        return name;
    }

    @Override
    public float getItemPrice(){
        float price = 0;
        for (FoodItemInterface foodItem : foodItems) {
            price += foodItem.getItemPrice();
        }
        return price;
    }

    @Override
    public void printItems(){
        System.out.println(comboName);
        for (FoodItemInterface foodItem : foodItems) {
            System.out.println("    -  " + foodItem.getItemName());
        }
    }
    
}
