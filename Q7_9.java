/*
(Find the smallest element) Write a method that finds the smallest element in 
an array of double values using the following header: 
 public static double min(double[] array)  
Write a test program that prompts the user to enter 10 numbers, invokes this 
method to return the minimum value, and displays the minimum value.                                
Here is a sample run of the program: 
 */
package sheet2;
import java.util.Scanner;
public class Q7_9 {
    public static double min(double[] array) {
        double smallest = array[0]; // assume first element is the smallest

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        return smallest;
    }

    // Main method to test it
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        double minValue = min(numbers);
        System.out.println("The minimum number is: " + minValue);
    }
}
