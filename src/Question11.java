import java.util.Scanner;

/*11)Write a Java program to solve quadratic
equations (use if, else if and else).
Input a: 1
Input b: 5
Input c: 1
Expected Output : The roots are -0.20871215252208009 and -4.7912878474779195
*/
public class Question11 {

    public static void main(String[] args) {
        SolveTheQuadraticEqn();
    }
    public static void SolveTheQuadraticEqn() {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = input.nextDouble();

        System.out.println("Input b: ");
        double b = input.nextDouble();

        System.out.println("Input c: ");
        double c = input.nextDouble();

       double result = b * b - 4.0 * a * c ;

       if (result > 0.0) {
           double root1 = (-b + Math.pow(result , 0.5))/ (2.0 * a);
           double root2 = (-b - Math.pow(result , 0.5))/ (2.0 * a);
           System.out.println("The roots are " + root1 + " and " + root2);
       } else if(result == 0) {
           double root1 = -b / (2.0 * a);
           System.out.println("The root is " + root1);
       } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
