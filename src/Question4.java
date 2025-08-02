import java.util.Arrays;

/*4)Write a Java Program to Compute the Sum of
Array Elements.
Input: [ 2, 4, 6, 7, 9]
Output: 28*/
public class Question4 {
    public static void main(String[] args) {
        int result = sumArray();
        System.out.println(result);
    }
    public static int sumArray() {
        int[] numbers = { 2, 4, 6, 7, 9};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum+= numbers[i];
        }
        return sum;
    }
}
