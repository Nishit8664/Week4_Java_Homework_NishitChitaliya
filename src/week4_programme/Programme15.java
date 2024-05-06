package week4_programme;

/**
 * 15. Display left angle triangle of * using nested for loops
 *          *
 *        * *
 *      * * *
 *    * * * *
 *  * * * * *
 */
public class Programme15 {
    public static void main(String[] args) {
        leftAngleTriangle();                                      //Calling method
    }
    public static void leftAngleTriangle(){                       //Print triangle
        for (int i=1;i<=5;i++){                                   //Nested for loops
            for (int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for (int k =1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
