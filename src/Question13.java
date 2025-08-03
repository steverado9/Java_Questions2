/*13)Write a Java program that takes a number
from the user and generates an integer between 1 and 7.
It displays the weekday name.
Input number: 3
Expected Output : Wednesday*/
public class Question13 {
    public static void main(String[] args) {
        displayWeekday(6);
    }
    public static void displayWeekday(int value) {
        String [] daysOfTheWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        if (value < 1 || value > 7) {
            int result = (int) Math.floor(Math.random() * 7);
            System.out.println(daysOfTheWeek[result]);
            return;
        }
        System.out.println(daysOfTheWeek[value - 1]);
    }
}
