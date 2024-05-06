package week4_programme;

/**
 * 5. Palindrome Number
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 * Check the tips below for more info about palindromes.
 * Example Input/Output
 * isPalindrome(-1221); → should return true
 * isPalindrome(707); → should return true
 * isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
 * 11212.
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));            //true
        System.out.println(isPalindrome(-333));             //true
        System.out.println(isPalindrome(789987));           //true
        System.out.println(isPalindrome(-127261));          //false
        System.out.println(isPalindrome(77077));            //true
        System.out.println(isPalindrome(11212));            //false
    }

    public static boolean isPalindrome(int number) {
        boolean num;
        int lastDigit;
        int reverse = 0;
        int tempNumber;
        tempNumber = number;                                    //Assigning value to temp variable

        while (number != 0) {                                   //While loop to reverse the number
            lastDigit = number % 10;                            //getting remainder
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }
        if (tempNumber == reverse) {
            num = true;
            return num;
        } else {
            num = false;
            return num;
        }
    }
}





