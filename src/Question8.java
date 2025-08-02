import java.util.HashSet;

/*8)Java Array Program to Remove All Occurrences of
an Element in an Array
Input: array = [ 1, 2, 1, 3, 5, 1 ] , key = 1
Output: [2, 3, 5]
Explaination: all the occurrences of element 1
is removed from the array So,
array becomes from [ 1, 2, 1, 3, 5, 1 ]  to
Final result: [2, 3, 5]
*/
public class Question8 {
    public static void main(String[] args) {
        removeAllOccurence();
    }
    public static void removeAllOccurence() {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);
        numbers.remove(1);

        System.out.println(numbers);
    }
}
