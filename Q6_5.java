/*
(Sort three numbers) Write a method with the following header to display 
three numbers in increasing order: 
 public static void displaySortedNumbers( double num1, double num2, double num3)  
Write a test program that prompts the user to enter three numbers and invokes 
the method to display them in increasing order. 
 */
package sheet2;
import java.util.Scanner;
public class Q6_5 {
     public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp;

        // make sure num1 <= num2
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // make sure num1 <= num3
        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }

        // make sure num2 <= num3
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.println("The numbers in increasing order are: " +
                num1 + ", " + num2 + ", " + num3);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();

        displaySortedNumbers(n1, n2, n3);
    }
}
