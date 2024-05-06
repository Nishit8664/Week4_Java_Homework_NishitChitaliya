package week4_programme;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme9 {
    public static void main(String[] args) {
        fibonacciNumber();                                   //Method calling
    }

    public static void fibonacciNumber() {
        int number = 1;                                       //Initial number = 1
        int sum = 0;
        for (int i = 1; i <= 10; i++) {                    //For loop to print 10 numbers
            System.out.print(number + " ");                 //Print fibonacci numbers
            int nextNum = sum + number;                     //Storing total to nextNum integer
            sum = number;                                   //Assigning number variable value to sum
            number = nextNum;                               //Assigning nextNum value to number variable
        }
    }
}
