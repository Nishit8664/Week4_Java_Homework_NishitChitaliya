package week4_programme;

/**
 * 14. Write a program in Java to display the pattern like a diamond.
 * While loop
 *       *
 *      ***
 *     *****
 *    *******
 *   *********
 *  ***********
 * *************
 *  ***********
 *   *********
 *    *******
 *     *****
 *      ***
 *       *
 */
public class Programme14 {
    public static void main(String[] args) {
        printFirstHalfOfDiamond();
        printAnotherHalfOfDiamond();
    }

    public static void printFirstHalfOfDiamond() {              //Print first half of diamond
        int i = 1, j = 1, k = 1, rows = 13;
        while (i <= rows) {                                     //Nested while loop
            while (j <= rows - i) {                             //Giving spaces
                // printing the required pattern
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (k <= i) {
                System.out.print("* ");                         //Printing *
                k++;
            }
            k = 1;
            i++;
            i++;
            System.out.println();
        }
    }

    public static void printAnotherHalfOfDiamond() {            //Printing bottom half
        int i = 1, j = 1, k = 1, rows = 13;
        while (i <= rows) {
            while (j <= i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (k <= rows - i - 1) {
                // printing the required pattern
                System.out.print(" *");
                k++;
            }
            k = 1;
            i++;
            i++;
            System.out.println();
        }
    }
}