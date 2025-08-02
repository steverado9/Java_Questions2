/*Write a Program to Find Factorial of a Number in Java.
Input: 5
Output: 120*/
public class Question2 {
    public static void main(String[] args) {
        int result = findFactorial(0);
        System.out.println(result);

    }
    public static int findFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; //result = result
        }
        return result;
    }
}
