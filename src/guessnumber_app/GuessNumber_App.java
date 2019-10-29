/*
 * Project 5-3
 * Professor: Tedd Sperling
 * Course: Introduction to JAVA - (72636)
 * Programmer: Ivoire Morrell
 * This program is a game where the user faces the computer to guess a random
 * number between 1 and 100. This program will include classes for number/continue
 * validation
 */
package guessnumber_app;

//import scanner class
import java.util.Scanner;

//import random class
import java.util.Random;

public class GuessNumber_App
{

    public static void main(String[] args)
    {
        //Display welcome message
        System.out.println("Welcome to the Guess the Number Game\n");

        System.out.println("I'm thinking of a number between 1 and 100. "
                + "\n" + "Try and guess the number.\n");

        //Create Scanner object
        Scanner sc = new Scanner(System.in);

        //initialize computer guess integer using imported random class
        Random rand = new Random();

        //Create variable to track user entry for number guessed
        int userGuess;

        //Create boolean variable to control outer loop
        boolean playGame = true;

        while (playGame)
        {
            int numberToGuess = rand.nextInt(100);
            boolean ok = true;
            int userTrys = 0;

            while (ok)
            {
                //Guess a number
                userGuess = CheckNumberInput.getIntWithinRange(sc,
                        "Guess a number: ", 0, 100);

                System.out.println();

                //Increment counter variable
                userTrys += 1;

                if (userGuess == numberToGuess)
                {
                    System.out.println("We have a winner!!\n");
                    ok = false;
                }
                else if (userGuess > numberToGuess)
                {
                    System.out.println(
                            "Guess to high!!!" + " Guess again" + "\n");
                    continue;
                }
                else
                {
                    System.out.println(
                            "Guess to low!!!!" + " Guess again." + "\n");
                    continue;
                }
            }
            //Display results
            if (userTrys <= 3)
            {
                System.out.println("You got it in " + userTrys + " trys." + "\n"
                        + "Number to guess was " + numberToGuess + "\n"
                        + "You must be some kind of mind reader");
            }
            else if (userTrys > 3 & userTrys < 7)
            {
                System.out.println("You got it in " + userTrys + " trys." + "\n"
                        + "Number to guess was " + numberToGuess + "\n"
                        + "Congradulations!!! You beat my Dogs high score!");
            }
            else
            {
                System.out.println("You got it in " + userTrys + " trys." + "\n"
                        + "Number to guess was " + numberToGuess + "\n"
                        + "Granny I told you this game was too advanced for you");
            }
            //Would user like to play again
            System.out.println();
            playGame = MyValidation.getContinue();
        }
        //Game ended
        System.out.println();
        System.out.println("I've seen better guessing from casino gamblers (lol). "
                + "Come back and play soon");
        System.out.println();
    }
}
