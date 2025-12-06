//(Conversion from miles to kilometers) Write a program that displays the 
//following table (note 1 mile is 1.609 kilometers): 
package sheet2;
public class Q5_4 {
     public static void main(String[] args){
        
        final Double RATIO = 1.609;
        
        System.out.println("Miles    Kilometers");

        for(int i = 1; i <= 10 ; i++){
            System.out.println(i + "        " + i * RATIO);
        }
    }
}