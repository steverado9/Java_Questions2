/*
10)Write a Java program that reads an integer and
check whether it is negative, zero, or positive.
Input number: 35
Expected Output : Number is positive*/
public class Question10 {
    public static void main(String[] args) {
        checkInteger(35);
    }
    public static void checkInteger( int value) {
        if (value < 0) {
            System.out.println("This is a negative number");
        } else if (value == 0) {
            System.out.println("This is number is zero");
        } else {
            System.out.println("This is a positive number");
        }
    }
}
