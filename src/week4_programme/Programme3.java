package week4_programme;

import java.util.Scanner;

/**
 * . Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Programme3 {
    public static void main(String[] args) {
        checkLetter();                                                  //Calling checkLetter method
    }

    public static void checkLetter() {                                  //checkLetter method to find type of letter
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character from alphabet: ");
        String letter = scanner.nextLine();

        //Checking String length
        if (letter.length() > 1) {
            System.out.println("Invalid character.");

            //Checking input is alpha bet or not
        } else if (!((letter.charAt(0) >= 65 && letter.charAt(0) <= 90) || (letter.charAt(0) >= 97 && letter.charAt(0) <= 122))) {
            System.out.println("Invalid character");

            //Checking for vowel
        } else if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")
                || letter.equals("A") || letter.equals("E") || letter.equals("I") || letter.equals("O") || letter.equals("U")) {
            System.out.println("Input letter is Vowel");
        } else {
            System.out.println("Input letter is Consonant");
        }
    }
}




