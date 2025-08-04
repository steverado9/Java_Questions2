//19)Write a Java method to check whether a string is a valid password.
//Password rules:
//A password must have at least ten characters.
//A password consists of only letters and digits.
//A password must contain at least two digits.
//xpected Output:
//1. A password must have at least ten characters.
//2. A password consists of only letters and digits.
//3. A password must contain at least two digits
//Input a password (You are agreeing to the above Terms and Conditions.): abcd1234xyz
//Password is valid: abcd1234xyz
public class Question19 {
    public static void main(String[] args) {
        isValidPassword("abcd1234xyz");
    }
    public static void isValidPassword(String password) {

        boolean hasLetter = false;
        boolean hasDigit = false;
        int digitCount = 0;
        for (char eachChar : password.toCharArray()) {
            if (Character.isDigit(eachChar)) {
                digitCount++;
                if (digitCount >= 2) {
                    hasDigit = true;
                }
            }
            if (Character.isLetter(eachChar)) {
                hasLetter = true;
            }
        }
        if (password.length() >= 10 && hasLetter && hasDigit ) {
            System.out.println("This is a valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
