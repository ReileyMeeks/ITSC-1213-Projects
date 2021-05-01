package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MagicSqaure {

    static int magicArr[][];
    boolean isMagicSqaure = true;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a file name:");
        String userFileNameInput = userInput.nextLine();

        readFile(userFileNameInput);


    }

    public static void readFile(String fileName) throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));
        int number = input.nextInt();
        magicArr = new int[number][number];

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                magicArr[i][j] = input.nextInt();
            }
        }
    }

    public boolean magicSqaureDetector(){
        int num = magicArr.length;

        boolean mSqaure[] = new boolean[num * num + 1];

        for (int i = 0; i < num; i++){
            for (int j = 0; j < num; j++){
                mSqaure[magicArr[i][j]] = true;
            }
        }

        for (int i = 1; i <= num * num; i++){
            if (mSqaure[i] == false) {
                isMagicSqaure = false;
            }
        }

        for (int i = 0; i < num; i++){
            int sum = 0;
            for (int j = 0; j < num; j++){
                sum += magicArr[i][j];
            }
            if(sum != num *(num*num+1)/2){
                isMagicSqaure = false;
            }
        }

        for (int i = 0; i < num; i++){
            int sum = 0;
            for (int j = 0; j < num; j++){
                sum += magicArr[j][i];
            }
            if(sum != num *(num*num+1)/2){
                isMagicSqaure = false;
            }
        }

        int sum = 0;
        for (int i = 0; i < num; i++){
            sum += magicArr[i][i];
        }

        if (sum != num*(num*num+1)/2){
            isMagicSqaure = false;
        }

        sum = 0;
        for (int i = 0; i < num; i++){
            sum += magicArr[i][num-i-1];
        }

        if (sum != num*(num*num+1)/2){
            isMagicSqaure = false;
        }

        return isMagicSqaure;
    }

    public String toString() {
        return "Do you have a magic sqaure? " + isMagicSqaure + '\n'
                + "Your entered values: " + '\n' + magicArr.length;
    }
}

