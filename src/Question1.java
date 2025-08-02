/**Write a Program to Swap Two Numbers
 Input: a=2  b=5
 Output: a=5  b=2*/
public class Question1 {
    public static void main(String[] args) {
        swapNumbers(5, 2);
    }
    public static void swapNumbers(int a, int b) {
        int newA = a;
         a = b;
         b = newA;
        System.out.println("a: "+ a + " b: " + b);
    }
}
