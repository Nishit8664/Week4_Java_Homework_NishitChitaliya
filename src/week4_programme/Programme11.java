package week4_programme;

/**
 * 11. Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */
public class Programme11 {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));                           //4
        System.out.println(getEvenDigitSum(123456789));                     //20
        System.out.println(getEvenDigitSum(-22));                           //-1
    }

    public static int getEvenDigitSum(int number) {                         //Method to sum even digit
        int digit;
        int evenDigitSum = 0;
        if (number < 0) {
            return -1;
        } else {
            while (number != 0) {
                digit = number % 10;                                        //Getting last digit
                number = number / 10;                                       //Eliminating last digit
                if (digit % 2 == 0)                                         //Checking that digit is even or not
                    evenDigitSum = evenDigitSum + digit;                    //If even then adding it to evenDigitSum
            }
            return evenDigitSum;                                            //return evenDigitSum
        }
    }
}
