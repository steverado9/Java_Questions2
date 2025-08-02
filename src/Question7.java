import java.util.HashSet;

/*7)Java Array Program to Remove Duplicate
Elements From an Array
Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
Output: [ 1, 2, 3, 4, 5 ]*/
public class Question7 {
    public static void main(String[] args) {
        removeDuplicate();
    }
    public static void removeDuplicate() {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers);
    }
}
