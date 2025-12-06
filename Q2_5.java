/*
(Financial application: calculate tips) Write a program that reads the subtotal 
and the gratuity rate, then computes the gratuity and total. For example, if the 
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 
as gratuity and $11.5 as total. Here is a sample run:
 */
package sheet1;
import java.util.Scanner;
public class Q2_5 {
     public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
         System.out.print("enter num in dollars= ");
         double num = input.nextDouble();
         double gratuity= num*(15.0/100);
         num+=gratuity;
         System.out.println("total= "+ num);
     }
}
