/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.util.InputMismatchException;

/**
 *
 * @author ReileyMeeks
 */
public class Lab4Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        addUserInput();
        divideUserInput();
        divideFromFile();
    }

    public static int addUserInput() {
        Scanner input = new Scanner(System.in);

        //Inputed numbers
        int firstNumber = 0;
        int secondNumber = 0;

        //Try Catch conditionals
        boolean fNum;
        boolean sNum;

        do {
            try {
                //First Number
                fNum = true;
                System.out.println("Enter first int:");
                firstNumber = input.nextInt();

            } catch (InputMismatchException e) {
                input.next();
                fNum = false;
                System.out.println("Invalid Number");
            }
        } while (fNum == false);

        input.nextLine();

        do {
            try {
                //Second Number
                sNum = true;
                System.out.println("Enter second int:");
                secondNumber = input.nextInt();

            } catch (InputMismatchException e) {
                input.next();
                sNum = false;
                System.out.println("Invalid Number");

            }
        } while (sNum == false);

        //Add the ints
        int total = firstNumber + secondNumber;
        System.out.println("The sum is: " + '\n' + total);

        return total;
    }

    public static int divideUserInput() {
        Scanner input = new Scanner(System.in);

        //Inputed numbers
        int firstNumber = 0;
        int secondNumber = 0;

        //Try Catch conditionals
        boolean fNum;
        boolean sNum;

        do {
            try {
                //First Number
                fNum = true;
                System.out.println("Enter first int:");
                firstNumber = input.nextInt();

            } catch (InputMismatchException e) {
                input.next();
                fNum = false;
                System.out.println("Invalid Number");
            }
        } while (fNum == false);

        input.nextLine();

        do {
            try {
                //Second Number
                sNum = true;
                System.out.println("Enter int divisor:");
                secondNumber = input.nextInt();
                if (secondNumber == 0) {
                    System.out.println("Cannot divide by zero");
                    sNum = false;
                }

            } catch (InputMismatchException e) {
                input.next();
                sNum = false;
                System.out.println("Invalid Number");

            }
        } while (sNum == false);

        //Add the ints
        int total = firstNumber / secondNumber;
        System.out.println("The quotient is: " + '\n' + total);

        return total;
    }

    public static void divideFromFile() {
        double total;
        double first;
        double second;
        

        Scanner input = new Scanner(System.in);
        String fileName;

        System.out.println("Enter file name:");
        fileName = input.next();

        try {
            File myFile = new File(fileName);
            Scanner fileScan = new Scanner(myFile);

            try {
                first = fileScan.nextDouble();
                second = fileScan.nextDouble();

                total = first / second;
                System.out.println("Total " + total);

            } catch (InputMismatchException e) {
                System.out.println("The file did not contain valid data.");
            }

        } catch (IOException e) {
            System.out.println("File not found");
        }

    }

}
