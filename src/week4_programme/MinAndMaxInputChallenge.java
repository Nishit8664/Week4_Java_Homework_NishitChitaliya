package week4_programme;

import java.util.Scanner;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        minAndMax();                                                        //Calling minAndMax method
    }

    public static void minAndMax() {
        Scanner scanner = new Scanner(System.in);                           //Scanner
        System.out.print("Enter number or -10 to stop: ");                  //We assume -10 as invalid number
        int number = scanner.nextInt();
        int max = number;
        int min = number;

        while (number != -10) {                                             //Endless while loop
            if (number > max) {                                             //Reassigning value
                max = number;
            }
            if (number < min) {
                min = number;
            }
            System.out.print("Enter number or -10 to stop: ");
            number = scanner.nextInt();
        }

        if (max != -10 && min != -10) {                                     //If to print th min and max value
            System.out.println("Minimum number is " + min);
            System.out.println("Maximum number is " + max);
        }
        scanner.close();
    }
}
