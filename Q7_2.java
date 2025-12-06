/*
(Reverse the numbers entered) Write a program that reads 10 integers then 
displays them in the reverse of the order in which they were read. 
 */
package sheet2;
import java.util.Scanner;
public class Q7_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10]; // store the 10 integers

        // Read 10 numbers from the user
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        // Display them in reverse order
        System.out.println("Numbers in reverse order:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
