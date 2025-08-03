//15)Write a Java program that accepts three numbers and prints
// "All numbers are equal" if all three numbers are equal,
// "All numbers are different" if all three numbers are different and
// "Neither all are equal or different" otherwise.
//Input first number: 2564
//Input second number: 3526
//Input third number: 2456
//Expected Output : All numbers are different
public class Question15 {
    public static void main(String[] args) {
        Accepts3Numbers(2564, 3526, 2456);
    }
    public static void Accepts3Numbers(int value1, int value2, int value3) {
        if (value1 == value2 && value2 == value3) {
            System.out.println("All numbers are equal");
        } else if (value1 != value2 && value2 != value3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
