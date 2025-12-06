/*
 (Count single digits) Write a program that generates 100 random integers 
between 0 and 9 and displays the count for each number. (Hint: Use an array of 
10 integers, say counts, to store the counts for the number of 0s, 1s, . . . , 9s.) 
 */
package sheet2;
import java.util.Random;
public class Q7_7 {
     public static void main(String[] args) {
        int[] counts = new int[10]; // to count 0–9
        Random random = new Random();

        // Generate 100 random integers between 0 and 9
        for (int i = 0; i < 100; i++) {
            int number = random.nextInt(10); // 0–9
            counts[number]++; // increase count for that number
        }

        // Display the count for each digit
        System.out.println("Digit counts after 100 random numbers:");
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + " occurs " + counts[i] + " times");
        }
    }
}
