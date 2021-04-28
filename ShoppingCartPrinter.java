/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcartprinter;
import java.util.Scanner;

/**
 *
 * @author ReileyMeeks
 */
public class ShoppingCartPrinter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();
        
        //Item 1
        System.out.println("What is your first item?");
        String firstItemName = input.nextLine();
        item1.setItemName(firstItemName);
        
        System.out.println("How much is it?");
        int firstItemCost = input.nextInt();
        input.nextLine();
        item1.setItemPrice(firstItemCost);
        
        System.out.println("How many did you get?");
        int firstItemPurchased = input.nextInt();
        input.nextLine();
        item1.setItemQuantity(firstItemPurchased);
        
        //Item 2
        System.out.println("What is your second item?");
        String secondItemName = input.nextLine();
        item2.setItemName(secondItemName);
        
        System.out.println("How much is it?");
        int secondItemCost = input.nextInt();
        input.nextLine();
        item2.setItemPrice(secondItemCost);
        
        System.out.println("How many did you get?");
        int secondItemPurchased = input.nextInt();
        input.nextLine();
        item2.setItemQuantity(secondItemPurchased);
  
        //Calc total
        int totalCost = (item1.getItemPrice() * item1.getItemQuantity()) + (item2.getItemPrice() * item2.getItemQuantity());
        
        //Print result
        System.out.println("Total Cost");
        System.out.println(item1.getItemQuantity() + " thing(s) of " + item1.getItemName() + " @ $" + item1.getItemPrice() + " each");
        System.out.println(item2.getItemQuantity() + " thing(s) of " + item2.getItemName() + " @ $" + item2.getItemPrice() + " each");
        System.out.println("Total: $" + totalCost);
    }
}
