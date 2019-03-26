package andretheape.csci210;

import java.util.Scanner;
public class Menu {
public double subTotal;
public static double runningTotal;
private static double itemPrice;
static boolean ordering = true;
static Scanner input = new Scanner(System.in);
public static void menu(){
    System.out.println("Welcome \n1. Chick-Fil-A Sandwich ($3.59) \n2. Fries ($1.50)\n3. Soda ($1.79) \n4. Milkshake(3.09) \n5. Done");
}
public static double itemPrice(int foodItem) {
    if (foodItem == 1) {
        System.out.println("You've ordered a Chick-Fil-A Sandwich");
        itemPrice = 3.59;
    }
    if (foodItem == 2) {
        
        System.out.println("You've ordered fries");
        itemPrice = 1.50;
    }
    if (foodItem == 3) {
        
        System.out.println("You've ordered a soda");
        itemPrice = 1.79;
    }
    if (foodItem == 4) {
        
        System.out.println("You've ordered a milkshake");
        itemPrice = 3.09;
    }
    quantity();
    return itemPrice;
}
public static double quantity() {
    System.out.println("Enter quantity");       
    double quantity = input.nextDouble();
    subTotal(quantity, itemPrice);
    return quantity;
 }
public static double subTotal(double quantity, double itemPrice) {
    double subTotal = quantity*itemPrice;
    System.out.println("Subtotal: "+ subTotal);
    runningTotal += subTotal;
    return subTotal;
}
public static void done(){
    ordering = false;
    System.out.println(runningTotal);
    System.out.println("My pleasure, enjoy your meal");
}
public static void main(String[] args) {
    int menuOption;
    int foodItem = 0;
    input = new Scanner(System.in); 
    do{
        menu();
        menuOption = input.nextInt();    
        switch(menuOption){
            case 1:
                foodItem = 1;
                itemPrice(foodItem);
                break;
            case 2:
                foodItem = 2;
                itemPrice(foodItem);
                break;
            case 3:
                foodItem = 3;
                itemPrice(foodItem);
                break;
            case 4:
            	foodItem = 4;
                itemPrice(foodItem);
                break;
            case 5:
            	  done();
                  break;    
            default:
                System.out.println("Invalid option.");
        }

    } while(ordering); {
}
}
}