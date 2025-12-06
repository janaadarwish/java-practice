/*
(Sum the major diagonal in a matrix) Write a method that sums all the 
numbers in the major diagonal in an n × n matrix of double values using the 
following header:
 */
package sheet2;
import java.util.Scanner;
public class Q8_2 {
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i]; // add element on the major diagonal
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[4][4]; // fixed 4-by-4 matrix

        System.out.println("Enter a 4-by-4 matrix row by row:");

        // read matrix elements
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        // call method and display result
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));
    }
}
