/*
(Population projection) The U.S. Census Bureau projects population based on 
the following assumptions:
 ■ One birth every 7 seconds
 ■ One death every 13 seconds
 ■ One new immigrant every 45 seconds
 Write a program to display the population for each of the next five years. Assume 
that the current population is 312,032,486, and one year has 365 days. Hint: In Java, 
if two integers perform division, the result is an integer. The fractional part is trun
cated. For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accu
rate result with the fractional part, one of the values involved in the division must be 
a number with a decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 */
package sheet1;

public class Q1_11 {
    public static void main(String[] args) {
        double goldenRule=60*60*24*365;
        
        double birthperyear= goldenRule/7;
        double deathperyear= goldenRule/13;
        double immigrantperyear= goldenRule/45;
        
        long pop= 312032486 ;
        double Rate= (birthperyear+immigrantperyear)-deathperyear;
        
        for (int year=1; year<=5; year++){
            pop += Rate;
            System.out.println("year " + year + "= " + pop);
        }
        
        System.out.println("goldenRule= " + goldenRule);
        System.out.println("deathperyear= " + deathperyear);
        System.out.println("birthperyear= " + birthperyear);
        System.out.println("immigrantperyear= " + immigrantperyear);
        
    }
}
