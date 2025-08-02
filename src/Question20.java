import javax.swing.text.DateFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//20)Write a Java method to display the current date and time.
//Expected Output: Current date and time: Wednesday January 25, 2017 7:47:43
public class Question20 {
    public static void main(String[] args) {
        String result = displayDate();
        System.out.println(result);
    }
    public static String displayDate() {
        LocalDateTime myObj = LocalDateTime.now();
        //formatting date and time
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern(" E, MMM dd yyyy HH:mm:ss ");
        String formattedDate = myObj.format(myFormatObj);
        return formattedDate;
    }
}
