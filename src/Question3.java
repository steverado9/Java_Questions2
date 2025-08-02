/*3)Write a Program to Calculate Simple Interest
 in Java
Input :  P = 10000  R = 5  T = 5
Output : 2500*/
public class Question3 {
    public static void main(String[] args) {
        int intrest = calcuateSimpleInterest(10000, 5, 5 );
        System.out.println("The simple intrest is = " + intrest);
    }
    public static int calcuateSimpleInterest(int P, int R, int T) {
        int soln = P * R * T ;
        int interest = soln;
        return interest;
    }
}
