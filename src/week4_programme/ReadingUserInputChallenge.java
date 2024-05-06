package week4_programme;

import java.util.Scanner;

/**
 * 1. Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge
 */
public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        sumOfTenNumbers();
    }

    public static void sumOfTenNumbers() {                          //Method to sum 10 numbers
        Scanner scanner = new Scanner(System.in);                   //Scanner
        int counter = 1;
        int sum = 0;
        while (counter <= 10) {                                     //While loop to take 10 user inputs and print sum of ten numbers given by user
            System.out.println("Enter number #" + counter);
            boolean checkNumber = scanner.hasNextInt();             //hasNextInt method to validate the given input is int
            if (checkNumber) {
                int num = scanner.nextInt();
                sum = sum + num;                                    //Storing and adding inputs by user to sum
                counter = counter + 1;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();                                     // Always return new userInput
        }
        System.out.println("Sum of all numbers = " + sum);          //Print the sum
        scanner.close();
    }
}