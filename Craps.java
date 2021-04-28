/**
 *
 * @author Reiley Meeks
 * @version 1.0
 * @since 2/3/2021 'dd/mm/yyyy' ITSC 1213-154 Craps Assignment
 *
 * Plays 100,000 rounds of craps
 *
 */
package craps;

import java.util.Random;

/**
 *
 * @author ReileyMeeks
 */
public class Craps {

    /**
     * @param args the command line arguments Plays the game and prints results
     */
    public static void main(String[] args) {
        //Create int vars for wins and losses
        int numWins = 0;
        int numLoss = 0;

        //Play the game
        for (int i = 0; i < 100000; i++) { //Change Loop Val as needed for testing
            System.out.println("Roll!");
            int score = rollDice(); //Create score var based off of rollDice return
            System.out.println("\n score " + score);

            //Check Score
            //Print result
            if (score == 7 || score == 11) {
                System.out.println("\n Score = " + score);
                System.out.println("You Win");
                numWins += 1;
            } else if (score == 2 || score == 3 || score == 12) {
                System.out.println("\n Score = " + score);
                System.out.println("You Lose");
                numLoss += 1;
            } else {
                int point = score;
                System.out.println("\n Point = " + point);
                while (true) {
                    score = rollDice();
                    System.out.println("\n Score new = " + score);
                    if (score == point) {
                        System.out.println("\n You Win");
                        numWins += 1;
                        break;
                    }
                    if (score == 7) {
                        System.out.println("\n You Lose");
                        numLoss += 1;
                        break;
                    }
                }
            }
        }
        
        //Print total wins, losses, gameWinProb
        System.out.println("\n Number of wins = " + numWins
                + " Number of loss = " + numLoss
                + " Probability for winning a game = " + (double) numWins / (numWins + numLoss));
    }

    /**
     * This generates the dice number
     *
     * @return
     */
    public static int rollDice() {
        //Genrate random num
        Random randomGenerator = new Random();
        int dice1 = randomGenerator.nextInt(6) + 1;
        int dice2 = randomGenerator.nextInt(6) + 1;
        System.out.println("\n dice1 = " + dice1 + " dice2 = " + dice2);
        return dice1 + dice2; //Return roll number
    }

}
