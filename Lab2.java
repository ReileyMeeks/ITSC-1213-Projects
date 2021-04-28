/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Scanner;

/**
 *
 * @author ReileyMeeks
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter Your Name:");
        String name = userInput.nextLine();
        
        System.out.println("Enter Street Number:");
        int streetNumber = userInput.nextInt();
        userInput.nextLine();
        
        System.out.println("Enter Street Name:");
        String streetName = userInput.nextLine();
        
        System.out.println("Enter City:");
        String city = userInput.nextLine();
        
        System.out.println("Enter State:");
        String state = userInput.nextLine();
        
        System.out.println("Enter Zip Code:");
        int zip = userInput.nextInt();
        
        System.out.println("Enter 800 Number:");
        int studentId = userInput.nextInt();
        userInput.nextLine();
        
        System.out.println("Enter Major:");
        String major = userInput.nextLine();
        
        System.out.println("Student Information:"); 
        System.out.println("Name: " + name);
        System.out.println("Adress: " + streetNumber + " " + streetName+ " "); 
        System.out.println(city + ", " + state + " " + zip); 
        System.out.println("Student Id: " + studentId); 
        System.out.println("Major: " + major); 
        
        //cellPhoneCost 
        System.out.println("Enter Plan: 29.95, 49.95, 69.95"); 
        String myPlan = userInput.nextLine();
        
        System.out.println("Please enter data used Ie 1.0, 2.5...:");
        double myUsedData = userInput.nextDouble();
        
        System.out.println("Monthly Charges" + '\n' + "$" + 
                cellPhoneCost(myPlan, myUsedData));
        
        squareDisplay(7);
        
    }
    /**
     * cost of rate plan and/or if right rate plan
     * @param plan
     * @param dataUsed
     * @return double value
     */
    public static double cellPhoneCost(String plan, double dataUsed){
        double planCost = Double.parseDouble(plan); //Convert plan into double
        double totalCostOverage; //Total Cost Of Plan with overages
        double moreSpent; //Spent over next plan
        double planB = 49.95; //For calc
        double planC = 69.95; //For calc
        
        //No overage Plan A
        if((planCost == 29.95) && (dataUsed <= 3)){
            System.out.println("This is the most cost effective plan.");
            return 29.95;
            
        }
        
        //Plan A overage and more spent calc
        if((planCost == 29.95) && (dataUsed > 3)){ 
            totalCostOverage = ((dataUsed - 3) * 10) + 29.95; //Total w/ overages
            moreSpent = totalCostOverage - planB; //Calc moreSpent
            
            //Determine cost effectivness below
            if(totalCostOverage < 49.95){
                System.out.println("This is the most cost effective plan.");
                return totalCostOverage;
              
            } else if((totalCostOverage >= 49.95) && (totalCostOverage < 69.95)){
                System.out.println("You spent $" + moreSpent + 
                        " over what you could pay for plan b.");
                return totalCostOverage;
                
            } else if(totalCostOverage >= 69.95){
                System.out.println("You spent $" + moreSpent + 
                        " over what you could pay for plan c.");
                return totalCostOverage;
            }
            return totalCostOverage; //Total cost plan A
        }
        
        //Plan B Cost
        if((planCost == 49.95) && (dataUsed <= 5)){
            System.out.println("This is the most cost effective plan.");
            return 49.95;
            
        }
        
        //Plan B Overage calc
        if((planCost == 49.95) && (dataUsed > 5)){
            totalCostOverage = ((dataUsed - 5) * 8) + 49.95;
            moreSpent = totalCostOverage - planC;
            
            if((totalCostOverage >= 49.95) && (totalCostOverage < 69.95)){
                System.out.println("This is the most cost effective plan.");
                return totalCostOverage;
                
            } else if(totalCostOverage > 69.95){
                System.out.println("You spent $" + moreSpent + 
                        " over what you could pay for plan c.");
                return totalCostOverage;
                
            }
            
            return totalCostOverage; //Total Cost Plan B
        }
        
        //Plan C cost
        if(planCost == 69.95){
            return 69.95;
        }
        
        return 0.0; //Default return
    }
    
    public static void squareDisplay(int inNum){
        if(inNum < 0 && inNum >= 15){
            return;
        }
        for(int i = 0; i < inNum; i++){
            for(int j = 0; j < inNum; j++){
                System.out.print("x");
        }
        System.out.println("");
        }
        
    }
}
