/*Write a Java Program to Find the Largest
Element in Array
Input: [ 7, 2, 5, 1, 4]
Output: 7*/
public class Question5 {
    public static void main(String[] args) {
        int result = maxNumber();
        System.out.println(result);
    }
    public static int maxNumber() {
        int [] numbers = { 7, 2, 5, 1, 4};
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
