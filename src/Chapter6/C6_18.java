package Chapter6;

import java.util.Scanner;

/**
 *
 *
 * @author Gabriel Tisnes
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //asks the user to enter a password
        System.out.print("Enter a password: ");
        String password = input.nextLine();

        System.out.println((isItAValidPassword(password) ? "Valid " : "Invalid ") + "Password");
    }

    public static boolean isItAValidPassword(String password) {
        //minimum length of password
        int validLength = 8;
        //minimum number of digits
        int numberDigits = 2;

        boolean validPassword
                = isLengthValid(password, validLength)
                && isOnlyLettersAndDigits(password)
                && hasNDigits(password, numberDigits);

        return validPassword;
    }

    public static boolean isLengthValid(String password, int validLength) {
        return password.length() >= validLength;
    }

    public static boolean isOnlyLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasNDigits(String password, int n) {
        int numberOfDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                numberOfDigits++;
            }
            if (numberOfDigits >= n) {
                return true;
            }
        }
        return false;
    }

}
