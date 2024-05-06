package week4_programme;

/**
 * Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Programme8 {
    public static void main(String[] args) {
        triangle();                                 //Calling triangle method
    }

    public static void triangle() {
        for (int i = 1; i <= 5; i++) {              //Nested for loops
            for (int j = 1; j <= i; j++) {          //Print colume
                System.out.print("@ ");
            }
            System.out.println(" ");                //Print to new line
        }
    }
}
