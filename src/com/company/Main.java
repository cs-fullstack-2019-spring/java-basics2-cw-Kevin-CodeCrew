package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        ex1();
//        ex2();
//        ex3();
//        ex4();
//        ex5();
//        ch6();
//        ch7();
        ch8();
    }


    // Print 0 through 100 using a while loop
    private static void ex1() {
        int kount = 0;

        while (kount <= 100) {
            System.out.println(kount);
            kount++;
        }

    }

    //    Print only the even numbers between 0 and 100 using a for loop
    private static void ex2() {
        int kount = 0;

        while (kount <= 100) {
            if (kount % 2 == 0) {
                System.out.println(kount);
            }
            kount++;
        }
    }

    //    Prompt the User for a number. Create a function in your program that counts from 0 to [NUMBER]
    private static void ex3() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the Max number : ");
        int maxValue = reader.nextInt();

        for (int y = 0; y <= maxValue; y++) {
            System.out.print(y + " ");
        }
        System.out.print("\n"); // add a newline
    }

    //    Prompt the User for secret word. Create a while loop that will continually ask the Player to guess
    //    the secret word until it’s correct, or 5 wrong guesses have been made. Once it’s correct print THAT’S CORRECT!!!
    //    and also how many guesses it took to get it right. If the Player doesn't get the secret word after 5 tries,
    //    end the program and print Sorry! Out of guesses :-(
    private static void ex4() {
        boolean rightAnswer = false;
        Scanner reader = new Scanner(System.in);
        int guesses = 5; // 5 guesses
        System.out.print("Enter a secret word for the game: ");
        String secretWord = reader.nextLine().trim();
        do {
            System.out.print("Enter your guess: ");
            // Check if correct answer. Use String.trim() and String.equalsIgnoreCase() to ignore case and remove any blanks
            if ((reader.nextLine().trim().equalsIgnoreCase(secretWord))) {
                // Answer matched
                rightAnswer = true;
                ;
            } else {
                System.out.println("Wrong... try again!!");
                guesses--; // Subtract a guess
            }

        } while (guesses > 0 && !rightAnswer); // Keep asking until they give right answer


        if (rightAnswer) {
            System.out.println("THAT’S CORRECT!!!\nYou guessed the secret word in " + (5 - guesses) + " guesses!");
        } else // GAME OVER MAN
        {
            System.out.println("GAME OVER MAN\nSorry, you didn't guess the secret word :-(");
        }

    }

    //    Create a program that sends a different function a number, and that function prints out that many “*”.
    private static void ex5() {
        ex5_func(10);
    }

    private static void ex5_func(int numstars) {
        for (int i = 1; i <= numstars; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print("*");
            }
            // Add a newline
            System.out.print("\n");
        }

    }

    //    Using the '*' function from earlier, produce the output found in the attached image exampleoutput.png:
    private static void ch6() {
            for (int x = 2; x <= 6; x += 2) {
                int diff = 6 - x;
                int padding = diff > 0 ? diff / 2 : 0;
                System.out.println(getPadding(padding)+getStars(x)+getPadding(padding));
            }
            // Add a trunk :-P
            System.out.print(getPadding(2)+getStars(2)+getPadding(2));

    }

    // Get spaces string to pad left/right
    private static String getPadding(int padlen) {
        String padStr = "";
        for (int y = 0; y < padlen; y++) {
            padStr += " ";
        }
        return padStr;
    }

    // Get a number of *
    private static String getStars(int padlen) {
        String padStr = "";
        for (int y = 0; y < padlen; y++) {
            padStr += "*";
        }
        return padStr;
    }
    //    You open a farm that accepts abandoned rabbits and where you feed and house them. business has been brisk and you
//    have already rescued 30 rabbits. Unfortunately, the rabbit population is growing at an annual rate of 22%, and the
//    max rabbits you can take in is 100.
//
//    Write a program that will calculate how long in years before you would exceed the maximum capacity (100) and how
//    big your rabbit population will be. Print out the results:
//
//    The rabbit population will be close to exceeding 100 after ? years. At that time, the rabbit population will be ?
    private static void ch7() {
        final double GROWTH_RATE = 0.22;
        int population, newPopulation, year, maxpop;
        maxpop = 100;
        newPopulation = population = 30;
        year = 0; //zero years from now; i.e., the present time
        while (newPopulation < 100) {
            year++;
            // Figure out what next years population will be
            newPopulation = (int) (population * (1 + GROWTH_RATE));
            if (newPopulation <= 100) {
                population = newPopulation;
            }
        }
        //Output results
        System.out.println("The rabbit population will be close to exceeding " + maxpop + " after " + year
                + " years.");
        System.out.println("At that time, the rabbit population will be " + population + ".");
    }

    //    Use looping to produce the following output
//
//        01 02 03 04 05 06 07 08 09
//
//        02 04 06 08 10 12 14 16 18
//
//        03 06 09 12 15 18 21 24 27
//
//        04 08 12 16 20 24 28 32 36

    private static void ch8() {

        // Create a function that counts 0 to 5 three times in a row.

        for (int x = 1; x <= 4; x++) {

            for (int y = 1; y <= 9; y++) {
                int prod=(y*x);
                String prodStr = String.valueOf(prod);
                // Cleaner way
//               prodStr = String.format("%02d",prod);
                System.out.print(prodStr + " ");
            }
            // Start next line
            System.out.print("\n");
        }

    }
}
