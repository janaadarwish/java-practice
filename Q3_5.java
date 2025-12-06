/*
 (Find future dates) Write a program that prompts the user to enter an 
integer for today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday 
is 6). Also prompt the user to enter the number of days after today for a future 
day and display the future day of the week. Here is a sample run: 
*/

package sheet1;
import java.util.Scanner; 
public class Q3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int today = input.nextInt();

        System.out.print("Enter the number of days after today: ");
        int futureDays = input.nextInt();

        int futureDay = (today + futureDays) % 7;

        String todayName = "";
        String futureDayName = "";

        switch (today) {
            case 0: todayName = "Sunday"; break;
            case 1: todayName = "Monday"; break;
            case 2: todayName = "Tuesday"; break;
            case 3: todayName = "Wednesday"; break;
            case 4: todayName = "Thursday"; break;
            case 5: todayName = "Friday"; break;
            case 6: todayName = "Saturday"; break;
            default: System.out.println("Invalid input for today's day!");
        }

        switch (futureDay) {
            case 0: futureDayName = "Sunday"; break;
            case 1: futureDayName = "Monday"; break;
            case 2: futureDayName = "Tuesday"; break;
            case 3: futureDayName = "Wednesday"; break;
            case 4: futureDayName = "Thursday"; break;
            case 5: futureDayName = "Friday"; break;
            case 6: futureDayName = "Saturday"; break;
        }

        System.out.println("Today is " + todayName + " and the future day is " + futureDayName);
    }
}
