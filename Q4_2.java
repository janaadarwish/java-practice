/*
(Geometry: great circle distance) The great circle distance is the 
distance between two points on the surface of a sphere. Let (x1, y1) and (x2, 
y2) be the geographical latitude and longitude of two points. The great circle 
distance between the two points can be computed using the following 
formula: 
d = radius ×arccos(sin (x1) ×sin(x2) + cos(x1) × cos(x2) × cos(y1 - y2)) 
Write a program that prompts the user to enter the latitude and longitude 
of two points on the earth in degrees and displays its great circle distance. 
The average radius of the earth is 6,371.01 km. Note you need to convert 
the degrees into radians using the Math.toRadians method since the Java 
trigonometric methods use radians. The latitude and longitude degrees in 
the formula are for northand we
 */
package sheet1;

import java.util.Scanner;
public class Q4_2 {
     public static void main(String[] args) {
        
        final Double RADIUS = 6371.01;

        Scanner i = new Scanner(System.in);
        
        System.out.print("Enter point 1 ( latitude and longitude ) in dgrees : ");
        Double x1 = i.nextDouble(), y1 = i.nextDouble();
        
        System.out.println();

        System.out.print("Enter point 2 ( latitude and longitude ) in dgrees : ");
        Double x2 = i.nextDouble(), y2 = i.nextDouble();

        System.out.println();

        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

        double bruh = (Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y2 - y1)); 

        Double d = RADIUS * Math.acos(bruh);
        
        System.out.printf("The distance between the two points is %.11f km\n", d);

        i.close();
    }
}
