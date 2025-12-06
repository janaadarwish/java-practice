//(Financial application: compute future tuition) Suppose the tuition for a 
//university is $10,000 this year and increases 5% every year. In one year, the 
//tuition will be $10,500. Write a program that displays the tuition in 10 years, and 
//the total cost of four years’ worth of tuition starting after the tenth year
package sheet2;
public class Q5_7 {
        public static void main(String[] args) {
        double tuition = 10000; // current tuition
        double annualIncreaseRate = 0.05; // 5%
        
        // Calculate tuition after 10 years
        for (int year = 1; year <= 10; year++) {
            tuition *= (1 + annualIncreaseRate);
        }
        
        System.out.printf("Tuition after 10 years: $%.2f%n", tuition);
        
        // Calculate total cost of four years after the 10th year
        double totalCost = 0;
        double tuitionForYear = tuition;
        for (int year = 1; year <= 4; year++) {
            totalCost += tuitionForYear;
            tuitionForYear *= (1 + annualIncreaseRate); // tuition increases every year
        }
        
        System.out.printf("Total cost for four years after the 10th year: $%.2f%n", totalCost);
    }
}
