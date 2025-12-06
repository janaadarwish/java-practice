/*
(Sum the digits in an integer) Write a method that computes the sum of the 
digits in an integer. Use the following method header:  
public static int sumDigits(long n) 
 For example, sumDigits(234) returns 9 (= 2 + 3 + 4).  
(Hint: Use the % operator to extract digits and the / operator to remove the 
extracted digit. For instance, to extract 4 from 234, use 234 % 10 (= 4). To remove 
4 from 234, use 234 / 10 (= 23). Use a loop to repeatedly extract and remove the 
digit until all the digits are extracted. Write a test program that prompts the user 
to enter an integer then displays the sum of all its digits 
 */
package sheet2;
import java.util.Scanner;
public class Q6_2 {
    public static int sumDigits(long n) {
        int sum = 0;

        // Keep looping while n still has digits
        while (n > 0) {
            sum += n % 10; // extract last digit and add to sum
            n /= 10;       // remove last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Ask user for a number
        System.out.print("Enter an integer: ");
        long number = input.nextLong();
        // Call the method and display result
        int result = sumDigits(number);
        System.out.println("The sum of digits is " + result);
    }
}
