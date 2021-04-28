/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinputt;
import java.util.Scanner;

/**
 *
 * @author ReileyMeeks
 */
public class UserInputt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //testScore
        //User input values to fill testScore param
        System.out.print("Enter Test One Score: ");
        int inTest1 = input.nextInt();
        System.out.print("Enter Test Two Score: ");
        int inTest2 = input.nextInt();
        System.out.print("Enter Test Three Score: ");
        int inTest3 = input.nextInt();
        input.nextLine();
        
        //pass var to param
        testScore(inTest1, inTest2, inTest3);
        
        //favCity
        //get user input
        System.out.print("What is your favourite city? ");
        String inFavCity = input.nextLine();
        
        //pass var to param
        favCity(inFavCity);
        
        //someInfo
        //Get user input
        System.out.print("What is your name? ");
        String inName = input.nextLine(); //used in someInfo and story
        System.out.print("How old are you? ");
        int inAge = input.nextInt(); //used in someInfo and story
        System.out.print("How much do you earn anually? ");
        int inSalary = input.nextInt();
        input.nextLine();
        
        //pass var to someInfo param
        someInfo(inName, inAge, inSalary);
        
        //story
        //Get user input and pass to param
        System.out.print("What is your cities name? ");
        String inCity = input.nextLine();
        System.out.print("What is your colleges name? ");
        String inCollege = input.nextLine();
        System.out.print("What is your job title? ");
        String inJob = input.nextLine();
        System.out.print("What type of pet do you have? ");
        String inPetType = input.nextLine();
        System.out.print("What is your pets name? ");
        String inPetName = input.nextLine();
        
        //pass var to story param
        story(inName, inCity, inCollege, inJob, inPetType, inPetName, inAge);
        
    }
    /**Calc average score from input values of user
     * 
     * @param test1
     * @param test2
     * @param test3 
     */
    public static void testScore(int test1, int test2, int test3){
        //Calc average
        int avgScore = (test1 + test2 + test3) / 3;
        
        //Print output
        System.out.println("Test One Score: " + test1);
        System.out.println("Test Two Score: " + test2);
        System.out.println("Test Three Score: " + test3);
        System.out.println("Average Score: " + avgScore);
    }
    
    /**Change string to all up and lowercase, print first char, print length
     * 
     * @param fCity 
     */
    public static void favCity(String fCity){
        //Count num of chars
        int sCount = 0;
        for(int i = 0; i < fCity.length(); i++){
            if(fCity.charAt(i) != ' '){
                sCount++;
            }
        }
        System.out.println("The number of letters in your cities name is: " + sCount);
        
        //Make uppercase
        System.out.println(fCity.toUpperCase());
        
        //Make lowercase
        System.out.println(fCity.toLowerCase());
        
        //Get first char
        char firstChar = fCity.charAt(0);
        System.out.println(firstChar);
    }
    
    /**Add user input data to print statement
     * 
     * @param name
     * @param age
     * @param salary 
     */
    public static void someInfo(String name, int age, int salary){
        System.out.println("My name is " + name + 
                ", and I am " + age + " years old." + '\n' + 
                "My anual salary is $" + salary);
    }
    /**Creates a story based off of user input
     * 
     * @param name
     * @param city
     * @param college
     * @param job
     * @param petType
     * @param petName
     * @param age 
     */
    public static void story(String name, String city, String college, 
            String job, String petType, String petName, int age){
        System.out.println("There once was a person named " + name + " who lived in " + city + ". " + '\n'
                + "At the age of " + age + ", " + name + " went to college at " + college + ". " + '\n'
                + name + " graduated and went to work as a " + job + ". " + '\n'
                + "Then, " + name + " adopted a(n) " + petType + " named " + petName + ". " + '\n'
                + "They both lived happily ever after!");
        
    }
    
}
