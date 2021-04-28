/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1213module3;

/**
 *
 * @author ReileyMeeks
 */
public class StudentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*** Part A ***");
        
        Student hakim = new Student();
        System.out.println(hakim.getFirstName());
        System.out.println(hakim.getLastName());
        System.out.println(hakim.getStudentId());
        System.out.println(hakim.getMajor());
        System.out.println(hakim.getGpa());
        System.out.println(hakim.getCredits());
        
        System.out.println("*** Part B ***");
        
        Student maria = new Student("Maria", "Garces", 800555555, 
                "Electrical Engineering", 3.75, 96);
        System.out.println(maria.getFirstName());
        System.out.println(maria.getLastName());
        System.out.println(maria.getStudentId());
        System.out.println(maria.getMajor());
        System.out.println(maria.getGpa());
        System.out.println(maria.getCredits());
        maria.transferToCard(89.0);
        maria.payFromCard(97.0);
        
        Student torrance = new Student("Torrance", "Deleon", 800234567, 
                "Aerospace Studies", 3.25, 75);
        
        System.out.println("Object torracne first name is " + torrance.getFirstName());
        torrance.setFirstName("Harini");
        System.out.println("Object torrance first name is " + torrance.getFirstName());
        
        System.out.println("Object torrance last name is " + torrance.getLastName());
        torrance.setLastName("Bart");
        System.out.println("Object torrance last name is " + torrance.getLastName());
        
        System.out.println("Object torrance ID is " + torrance.getStudentId());
        torrance.setStudentId(973245);
        System.out.println("Object torrance ID is " + torrance.getStudentId());
        
        System.out.println("Object torrance Major is " + torrance.getMajor());
        torrance.setMajor("Computer Science");
        System.out.println("Object torrance Major is " + torrance.getMajor());
        
        System.out.println("Object torrance gpa is " + torrance.getGpa());
        torrance.setGpa(4.0);
        System.out.println("Object torrance gpa is " + torrance.getGpa());
        
        System.out.println("Object torrance credits are " + torrance.getCredits());
        torrance.setCredits(99);
        System.out.println("Object torrance credits are " + torrance.getCredits());
        
        torrance.transferToCard(100.0);
        torrance.payFromCard(50.0);
        torrance.payFromCard(52.0);
        
    }
    
}
