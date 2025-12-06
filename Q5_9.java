//(Find the two highest scores) Write a program that prompts the user to enter 
//the number of students and each student’s name and score, and finally displays 
//the student with the highest score and the student with the second-highest score. 
//Use the next() method in the Scanner class to read a name rather than using the 
//nextLine() method. Assume that the number of students is at least 2
package sheet2;
import java.util.Scanner;
public class Q5_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Initialize variables for top 2 students
        String topStudent1 = "";
        double topScore1 = -1;  // highest
        String topStudent2 = "";
        double topScore2 = -1;  // second highest

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter student name: ");
            String name = input.next();  // using next() as required

            System.out.print("Enter " + name + "'s score: ");
            double score = input.nextDouble();

            // Compare and update top scores
            if (score > topScore1) {
                // Shift first to second
                topScore2 = topScore1;
                topStudent2 = topStudent1;

                // Update first
                topScore1 = score;
                topStudent1 = name;
            } else if (score > topScore2) {
                topScore2 = score;
                topStudent2 = name;
            }
        }

        // Display results
        System.out.println("\nStudent with the highest score: " + topStudent1 + " (" + topScore1 + ")");
        System.out.println("Student with the second-highest score: " + topStudent2 + " (" + topScore2 + ")");
    }
}
