package week4_programme;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class Programme6 {
    public static void main(String[] args) {
        printTriangle();
    }

    public static void printTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scanner.nextInt();
        int number;
        for (int i = 1; i < n; i++) {
            number = 1;
            for (int j = 1; j <= i; j++) {              //loop for columns
                System.out.print(number + " ");         //prints num
                number++;                               //incrementing the value of number
            }
            System.out.println();                        //throws the cursor at the next line after printing each row
        }
    }
}
