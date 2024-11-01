import FoodItems.*;
import java.util.*;
import Combos.*;
import Decorators.*;

public class MenuManager {
    private ArrayList<FoodItemInterface> menu = new ArrayList<FoodItemInterface>();
    Scanner sc = new Scanner(System.in);

    public MenuManager(){
        initializeMenu();
    }

    public void initializeMenu(){
        menu.add(new Burger(300));
        menu.add(new Fries(100));
        menu.add(new Wedges(150));
        menu.add(new Drinks(25));
        menu.add( 
            new ComboItems("Combo1")
                .addFoodItem(new Burger(300))
                .addFoodItem(new Fries(100))
                .addFoodItem(new FreeFoodItemDecorator(new Drinks(25)))
        );
        menu.add( 
            new DiscountedFoodDecorator((
                new ComboItems("Combo2")
                    .addFoodItem(new Swarma(200))
                    .addFoodItem(new Drinks(25))
                ), 
                4.444444444444444445f
            )
        );
    }

    public FoodItemInterface getFoodByName(String name){
        int length = name.length();
        for (FoodItemInterface foodItem : menu) {
            String foodName = foodItem.getItemName();
            if( foodName.length() >= length ){
                String subString = foodItem.getItemName().substring(0, length);
                if (subString.equalsIgnoreCase(name)) {
                    return foodItem;
                }
            }
        }
        return null;
    }

    public void addComboToMenu(){
        System.out.println("Enter the name of the combo");
        String comboName = sc.nextLine();
        ComboItems combo = new ComboItems(comboName);
        Boolean running = true;
        int discount = -1;

        while(running){
            String cmd = sc.nextLine();
            String[] parts = cmd.split(" ");
            // System.out.println(parts[0]+ " "+ parts[1]);

            switch(parts[0].toLowerCase()){
                case "add":
                    FoodItemInterface foodItem = getFoodByName(parts[1]);
                    if( foodItem != null ){
                        combo.addFoodItem(foodItem);
                    }else {
                        System.out.println("Food item not in menu");
                    }
                    break;
                case "remove":
                    var check = combo.removeFoodItemByName(parts[1]);
                    if( check == null ){
                        System.out.println("Food item not in combo");
                    }
                    break;
                case "free":
                    foodItem = getFoodByName(parts[1]);
                    if( foodItem != null ){
                        combo.addFoodItem(new FreeFoodItemDecorator(foodItem));
                    }else {
                        System.out.println("Food item not in menu");
                    }
                    break;
                case "discount":
                    discount = Integer.parseInt(parts[1]);
                    break;
                case "done":
                    if( discount != -1 ){
                        menu.add(new DiscountedFoodDecorator(combo, discount));
                    }else {
                        menu.add(combo);
                    }
                    combo.printItems();
                    running = false;
                    break;
                default:
                    System.out.println("Invalid command");

            }
        }
    }


    public void printMenu(){
        for( var foodItem : menu ){
            System.out.println(foodItem.getItemName() + " - " + foodItem.getItemPrice()+"tk");
        }
        System.out.println();
    }
}