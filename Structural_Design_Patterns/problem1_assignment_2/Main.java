import java.util.*;


public class Main {
    public static void main(String[] args) {
        // ComboItems combo1 = new ComboItems("Super_Combo");

        // combo1.addFoodItem(new FreeFoodItemDecorator(new Burger(10)));
        // combo1.addFoodItem(new Fries(5));
        // combo1.addFoodItem(new Wedges(5));

        // FoodItemInterface discountedCombo1 = new DiscountedFoodDecorator(combo1, 10);
        // discountedCombo1.printItems();
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        MenuManager menuManager = new MenuManager();
            menuManager.printMenu();

        while(choice != 0)
        {
            System.out.println("Press 1 to create a combo, 2 to view menu and 0 to exit");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    menuManager.addComboToMenu();
                    break;
                case 2:
                    menuManager.printMenu();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }   

        sc.close();
    }
}