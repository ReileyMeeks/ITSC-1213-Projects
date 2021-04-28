/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ReileyMeeks
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*BurgerOrder order1 = new BurgerOrder(3, 4, 5, 7, 2, false);
        BurgerOrder order2 = new BurgerOrder(0, 2, 4, 9, 1, true);
        BurgerOrder order3 = new BurgerOrder(1, 2, 3, 4, 5, false);
        
        order1.setNumSodas(12);
        
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);*/
        
        FastFoodKitchen kitchen = new FastFoodKitchen();
        Scanner sc = new Scanner(System.in);

        while (kitchen.getNumOrdersPending() != 0) {
            // see if user wants to add an order
            System.out.println("Please select from the following menu of options, by typing a number:");
            System.out.println("\t 1. Order food");
            System.out.println("\t 2. Check on an order");
	     System.out.println("\t 3. Show all the orders currently pending.");
            System.out.println("\t 4. Do nothing (just waiting)");
            System.out.println("\t 5. Cancel Order");
            try {
                int num = sc.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("How many hamburgers do you want?");
                        int ham = sc.nextInt();
                        System.out.println("How many cheeseburgers do you want?");
                        int cheese = sc.nextInt();
                        System.out.println("How many veggieburgers do you want?");
                        int veggie = sc.nextInt();
                        System.out.println("How many sodas do you want?");
                        int sodas = sc.nextInt();
                        System.out.println("Is your order to go? (Y/N)");
                        char letter = sc.next().charAt(0);
                        boolean TOGO = false;
                        if (letter == 'Y' || letter == 'y' ) {
                            TOGO = true;
                        } 
                        int orderNum = kitchen.addOrder(ham, cheese, veggie, sodas, TOGO);
                        System.out.println("Thank-you. Your order number is " + orderNum);
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("What is your order number?");
                        int order = sc.nextInt();
                        boolean ready = kitchen.isOrderDone(order);
                        if (ready) {
                            System.out.println("Yes, we already called out order number " + order);
                        } else {
                            System.out.println("No, it's not ready, but it should be up soon. Sorry for the wait.");
                        }
                        System.out.println();
                        break;
			case 3: 
			    System.out.println(kitchen);
			    break;
                    case 4:
                        break;
                    default:
                        System.out.println("Sorry, but you need to enter a 1, 2, 3 , 4, or 5");
                        
                    case 5:
                        System.out.println("Enter order num to cancel: ");
                        int orderID = sc.nextInt();
                        //kitchen.cancelOrder(orderID);
                        if(kitchen.cancelOrder(orderID) == true){
                           System.out.println("Your order has been cancelled."); 
                        } else {
                            System.out.println("Sorry, we can't find your order in our system.");
                        }
                        break;
                        
                }
            } catch (InputMismatchException ime) {
                System.out.println("Sorry, but that wasn't a number.");
            }
            // simulate cooking activity in the kitchen
            kitchen.simulateKitchenActivity();
            
    } // end while loop

      
    }
    
}
