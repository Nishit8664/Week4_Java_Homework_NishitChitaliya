package week4_programme;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=15
 */
public class Programme10 {
    public static void main(String[] args) {
        isArmstrongNumber();                            //Method Calling
    }

    public static void isArmstrongNumber() {
        Scanner scanner = new Scanner(System.in);       //Scanner
        System.out.println("Enter number : ");
        int num = scanner.nextInt();
        int lastDigit;                                  //Getting last digit
        int temp;
        double sum = 0;
        temp = num;                                     //Storing num value to temp variable
        while (temp != 0) {
            lastDigit = temp % 10;                      //Taking last digit
            sum = sum + Math.pow(lastDigit, 3);         //Finding pow of last digit using math.pow method and storing it to sum variable
            temp = temp / 10;                           //Eliminating last digit
        }
        if (sum == num) {                               //Comparing 2 numbers
            System.out.println(num + " is an armstrong number");
        } else {
            System.out.println(num + " is not an armstrong number");
        }
        scanner.close();
    }
}
