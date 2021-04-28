/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

import java.util.Scanner;

/**
 *
 * @author ReileyMeeks
 */
public class CashRegister {
    private PaymentType payment;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cRegister();
    }
    
    public static void cRegister(){
        String pay;//Set user payment
        Scanner input = new Scanner(System.in);
        double change = 0; //Change amount
        double tax = 0.07; //Set tax rate
        double taxAmount; //Determine amount of tax
        double total;//Total of order
        double subTotal; //Create subtotal
        double userPayed; //determine user amount payed
        int userPaymentChoice;//Get user payment 
        int userPaymentChoice2; //Second user payemnt
        boolean paidInFull = false;//Determine if paid in full
        boolean changeDue = false; //Determine if change is due
        
        while(paidInFull == false){
            System.out.println("How are you paying?");
            System.out.println("Press \n"
                    + "1 for Cash, \n"
                    + "2 for Debit, \n"
                    + "3 for Credit, \n"
                    + "4 for Check");
            userPaymentChoice = input.nextInt();
            if(userPaymentChoice == 1){
                pay = "Cash";
            } else if(userPaymentChoice == 2){
                pay = "Debit";
            } else if(userPaymentChoice == 3){
                pay = "Credit";
            } else if(userPaymentChoice == 4){
                pay = "Check";
            }
            
            input.nextLine();
            
            System.out.println("Enter Your items: \n"
                    + "Item 1:");
            String item1 = input.nextLine();
            System.out.println("Enter Price:");
            double item1Cost = input.nextDouble();
            input.nextLine();
            
            System.out.println("Item 2: ");
            String item2 = input.nextLine();
            System.out.println("Enter Price:");
            double item2Cost = input.nextDouble();
            input.nextLine();
            
            System.out.println("Item 3: ");
            String item3 = input.nextLine();
            System.out.println("Enter Price:");
            double item3Cost = input.nextDouble();
            input.nextLine();
            
            subTotal = item1Cost + item2Cost + item3Cost;
            taxAmount = subTotal * tax;
            total = subTotal + taxAmount;
            System.out.println("Your total: " + total);
            
            System.out.println("Enter Payment amount");
            userPayed = input.nextDouble();
            
            if(userPayed == total){
                paidInFull = true;
                changeDue = false;
                
            } else if(userPayed < total){
                System.out.println("Only two payemnt types supported, \n"
                        + "How are you paying for the rest?");
            System.out.println("Press \n"
                    + "1 for Cash, \n"
                    + "2 for Debit, \n"
                    + "3 for Credit, \n"
                    + "4 for Check");
            userPaymentChoice2 = input.nextInt();
            if(userPaymentChoice2 == 1){
                pay = "Cash";
            } else if(userPaymentChoice2 == 2){
                pay = "Debit";
            } else if(userPaymentChoice2 == 3){
                pay = "Credit";
            } else if(userPaymentChoice2 == 4){
                pay = "Check";
            }
                paidInFull = true;
                changeDue = false;
            
            } else if(userPayed > total){
                change = total - userPayed;
                changeDue = true;
                paidInFull = true;
            }
            if(changeDue == false){
            System.out.println("Item 1: " + item1 + " $" + item1Cost + '\n'
                        + "Item 2: " + item2 + " $" + item2Cost + '\n'
                        + "Item 3: " + item3 + " $" + item3Cost + '\n'
                        + "Subtotal: " + subTotal + '\n'
                        + "Tax Paid: " + taxAmount + '\n'
                        + "Total: " + total);
            
            } else if(changeDue == true){
                System.out.println("Item 1: " + item1 + " $" + item1Cost + '\n'
                        + "Item 2: " + item2 + " $" + item2Cost + '\n'
                        + "Item 3: " + item3 + " $" + item3Cost + '\n'
                        + "Subtotal: " + subTotal + '\n'
                        + "Tax Paid: " + taxAmount + '\n'
                        + "Total: " + total + '\n' +
                        "Change: " + change);
                
            }
        }
    }
    
}
