package week4_programme;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class Programme12 {
    public static void main(String[] args) {
        isPrime();                                      //Method calling
    }

    public static void isPrime() {                      //method
        int number = 1;
        int primeUpto = 100;
        while (number < primeUpto) {
            boolean flag = false;
            for (int i = 2; i <= number / 2; ++i) {
                if (number % i == 0) {                       // condition for nonprime number
                    flag = true;
                    break;
                }
            }
            if (!flag && number != 0 && number != 1)        //condition for prime number
                System.out.print(number + ", ");
            ++number;
        }
        System.out.print("...are the prime numbers.");
    }
}

