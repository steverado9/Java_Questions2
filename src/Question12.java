/*
* 12)Write a Java program that takes three numbers
* from the user and prints the greatest number.
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output : The greatest: 87*/
public class Question12 {
    public static void main(String[] args) {
        int result = greatestNumber(25, 78, 87);
        System.out.println(result);
    }

    public static int greatestNumber(int number1, int number2, int number3) {
        int [] numbers = {number1, number2, number3};
        int newNumber = 0 ;

        for (int i = 0; i < numbers.length; i++) {
            if (newNumber < numbers[i]) {
                newNumber = numbers[i];
            }
        }
        return newNumber;
    }
}
