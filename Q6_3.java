/*
(Palindrome integer) Write the methods with the following headers:  
// Return the reversal of an integer, e.g., reverse(456) returns 654  
public static int reverse(int number)  
// Return true if number is a palindrome 
 public static boolean isPalindrome(int number) 
 Use the reverse method to implement isPalindrome. A number is a palindrome if 
its reversal is the same as itself. Write a test program that prompts the user to 
enter an integer and reports whether the integer is a palindrome
 */
package sheet2;
import java.util.Scanner;
public class Q6_3 {
     public static int reverse(int number) {
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;        // extract last digit
            reverse = reverse * 10 + digit; // build reversed number
            number /= 10;                   // remove last digit
        }

        return reverse;
    }

    // Method to check if a number is palindrome
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    // Test program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
