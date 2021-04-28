/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6project;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dwilso1
 */
public class Lab6Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Student ID Int:");
        int sID = input.nextInt();
        
        ArrayList<Person> list = new ArrayList<Person>();

        Person p1 = new Person("Alice", 1000);
        list.add(p1);

        Student s1 = new Student("Keisha", 900, "CS", 3.5);
        list.add(s1);

        Student s2 = new Student("Felipe", 901, "English", 3.2);
        list.add(s2);

        Professor pr1 = new Professor("Jamika", 300, "CS", 101000);
        list.add(pr1);

        Person p2 = new Person("Tala", 1001);
        list.add(p2);

        Professor pr2 = new Professor("Julio", 400, "Math", 85000);
        list.add(pr2);

        Student s3 = new Student("Huan", 902, "CS", 3.6);
        list.add(s3);

        Student s4 = new Student("Hank", 903, "Engineering", 3.9);
        list.add(s4);

        Student s5 = new Student("Mike", 904, "Math", 2.8);
        list.add(s5);

        Professor pr3 = new Professor("Azzari", 500, "CS", 100000);
        list.add(pr3);

        Professor pr4 = new Professor("Juan", 600, "CS", 980000);
        list.add(pr4);
        
        for (Person a : list) {
            System.out.println(a);
        }

        for (Person l : list) {
            matchId(l, sID);
        }

        for (Person p : list) {
            if (p instanceof Student) {
                if (((Student) p).getGpa() > 3.5) {
                    System.out.println(p.getName());
                }
            }
        }

        for (Person q : list) {
            if (q instanceof Professor) {
                System.out.println(q.getName());
            }
        }

        Person pq = new Person("Bob", 900);
        if (pq instanceof Student) {
            System.out.println(((Student) pq).getGpa());
        }

        list.add(pq);

    }

    public static boolean matchId(Person p, int id) {
        boolean isMatch = false;

        if (id == p.getId()) {
            isMatch = true;
            System.out.println(p);
        }
        
        return isMatch;
    }

}
