import java.util.ArrayList;

//6)Java Array Program For Array Rotation
//Input: arr[] = {1, 2, 3, 4, 5, 6, 7},  d = 2
//Output: [ 3, 4, 5, 6, 7, 1, 2 ]
//Explanation: d=2 so 2 elements are rotated to the
// end of the array. So, 1 2 is rotated back.
// So, Final result: 3, 4, 5, 6, 7, 1, 2
//input array
//output array
//process:
// loop through the array and remove the from the fron "d" times
// and add it to the back "d" times
public class Question6 {
    public static void main(String[] args) {
        rotateArray();
    }
    //method to rotateArray
    public static void rotateArray() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;

        ArrayList<Integer> finalResult = new ArrayList<Integer>();

        //stroing array inside finalResult array
        for (int i = d; i < arr.length; i++ ) {
            finalResult.add(i + 1);
        }

        for (int i = 1; i <  arr.length; i++ ) {
            finalResult.add(i);
            if (i == d) {
                break;
            }
        }

        System.out.println(finalResult);
    }
}
//Not correct but i got the answer
