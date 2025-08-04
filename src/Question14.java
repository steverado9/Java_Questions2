import java.util.Scanner;

//14)Write a program in Java to input 5 numbers from
// the keyboard and find their sum and average.
//Input the 5 numbers seperated by a
// comma  :      1, 2, 3, 4, 5
//The sum of 5 no is : 15
//The Average is : 3.0
public class Question14 {
    public static void main(String[] args) {
        sumFiveNumbers();
    }
    public static void sumFiveNumbers() {
        Scanner input = new Scanner(System.in);

        System.out.println("number1: ");
        int number1 = input.nextInt();

        System.out.println("number2: ");
        int number2 = input.nextInt();

        System.out.println("number3: ");
        int number3 = input.nextInt();

        System.out.println("number4: ");
        int number4 = input.nextInt();

        System.out.println("number1: ");
        int number5 = input.nextInt();

        int [] result = {number1, number2, number3, number4, number5};
        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            sum += result[i];
        }

        System.out.println("The sum is : " + sum);
    }
}
