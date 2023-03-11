/*Days of the week are represented as three-letter strings ("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun").
Write a function solution that, given a string S representing the day of the week and an integer K (between 0 and 500,
inclusive), returns the day of the week that is K days later.
For example, given S = "Wed" and K = 2, the function should return "Fri".
Given S = "Sat" and K = 23, the function should return "Mon".*/

package round2;

public class task1Solution {

    public static int dayCounter(int daysLater) {
        return daysLater % 7;
    }

    public static String dayCalculator(String givenDay, int additionalDay) {
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int count = 0;
        for (int i = 0; i < 7; i++) {
            if (days[i].equals(givenDay)) {
                count = i;
            }
        }
        return days[dayCounter(count + additionalDay)];
    }


    public static void main(String[] args) {
        int k = 2;
        String day = "Wed";

        System.out.println(dayCalculator(day, dayCounter(k)));
    }
}