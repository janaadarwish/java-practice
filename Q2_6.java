/*
(Sum the digits in an integer) Write a program that reads an integer between 0 
and 1000 and adds all the digits in the integer. For example, if an integer is 932, 
the sum of all its digits is 14.
 Hint: Use the % operator to extract digits, and use the / operator to remove the 
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
 Here is a sample run:
 */
package sheet1;

import java.util.Scanner;

public class Q2_6 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 1000: "); 
        int num= input.nextInt();
        
        if(num>=0 && num<=1000){
            
            int R1= num%10;
            int P1=num/10;
            
            int R2= num%10;
            int P2=num/10;
            
            int R3= num%10;
            
            int sum= R1+R2+R3;
            
            System.out.println("The sum of digits is " + sum);
        } else {
            System.out.println("Error: please enter a number between 0 and 1000");
        }
    }
}