/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1213module3;

/**
 * This class creates vars, getters, setters, and methods to be passed into-- 
 * StudentDriver
 * @author ReileyMeeks
 */
public class Student {
    private String firstName;
    private String lastName;
    private int studentId;
    private String major;
    private double gpa;
    private int credits;
    private double cardBalance;
    
    /**
     * For use in creating a new student object
     * @param fName
     * @param lName
     * @param id
     * @param major
     * @param gpa
     * @param credits 
     */
    public Student(String fName, String lName, int id, String major, 
            double gpa, int credits){
       this.firstName = fName;
       this.lastName = lName;
       this.studentId = id;
       this.major = major;
       this.gpa = gpa;
       this.credits = credits;
    }
    /**
     * Default student constructor 
     */
    Student() {
     
    }
    //Getter/Accsessor methods
    /**
     * Getter method for firstName
     * @return 
     */
    public String getFirstName(){
        return firstName;
    }
    /**
     * Getter method for lastName
     * @return 
     */
    public String getLastName(){
        return lastName;
    }
    /**
     * Getter method for studentId
     * @return 
     */
    public int getStudentId(){
        return studentId;
    }
    /**
     * Getter method for major
     * @return 
     */
    public String getMajor(){
        return major;
    }
    /**
     * Getter method for gpa
     * @return 
     */
    public double getGpa(){
        return gpa;
    }
    /**
     * Getter method for credits
     * @return 
     */
    public int getCredits(){
        return credits;
    }
    /**
     * Getter method for cardBalance
     * @return 
     */
    public double getCardBalance(){
        return cardBalance; 
    }
    //Setter/Mutator Methods
    /**
     * Setter method to set firstName to fName
     * @param fName 
     */
    public void setFirstName(String fName){
        this.firstName = fName;
    }
    /**
     * Setter method to set lastName to lName
     * @param lName 
     */
    public void setLastName(String lName){
        this.lastName = lName;
    }
    /**
     * Setter method to set studentId to id
     * @param id 
     */
    public void setStudentId(int id){
        this.studentId = id;
    }
    /**
     * Setter method to set major to major
     * @param major 
     */
    public void setMajor(String major){
        this.major = major;
    }
    /**
     * Setter method to set gpa to gpa
     * @param gpa 
     */
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    /**
     * Setter method to set credits to credits
     * @param credits 
     */
    public void setCredits(int credits){
        this.credits = credits;
    }
    //49er Card Methods
    /**
     * Checks to see if valid amount is transfered, if yes adds to cardBalance
     * @param amount 
     */
    public void transferToCard(double amount){
        if(amount > 0){
            this.cardBalance = this.cardBalance + amount;
            System.out.println("Your new balance is: " + this.cardBalance);
        } else if(amount < 0){
            System.out.println("The transfer amount must be greater than 0.");
        }
    }
    /**
     * Checks if valid amount is being removed, if yes subtracts from cardBalance
     * @param amount 
     */
    public void payFromCard(double amount){
        if(amount <= this.cardBalance){
            this.cardBalance = this.cardBalance - amount;
            System.out.println("Your new balance is: " + this.cardBalance);
        } else if(amount > this.cardBalance){
            System.out.println("Sorry, your balance is too low!");
        }
    }
    
}
