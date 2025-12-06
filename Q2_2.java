/*
(Compute the volume of a cylinder) Write a program that reads in the radius 
and length of a cylinder and computes the area and volume using the following 
formulas:
 area = radius * radius * π
 volume = area * length
 */
package sheet1;

import java.util.Scanner;
public class Q2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();


        System.out.print("Enter the length of the cylinder: ");
        double length = input.nextDouble();


        double area = radius * radius * Math.PI;
        double volume = area * length;


        System.out.printf("The area is %.2f\n", area);
        System.out.printf("The volume is %.2f\n", volume);

        input.close();
    }
}
