package Chapter6;

import java.util.Scanner;

/**
 * Program for user to enter a password and check if it's valid or invalid
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

    /**
     * Method to check if password is valid or not
     *
     * @param password the password submitted by the user
     * @return true or false if password is valid
     */
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

    /**
     * Main Method
     *
     * @param password the password submitted by the user
     * @param validLength checks to see if the password length is valid or
     * invalid
     * @return true or false if length of password is valid
     */
    public static boolean isLengthValid(String password, int validLength) {
        return password.length() >= validLength;
    }

    /**
     * Method checks to see if it has letters AND digits
     *
     * @param password the password submitted by the user
     * @return true or false if password is only letter and digits
     */
    public static boolean isOnlyLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Method to check the number of digits
     *
     * @param password the password submitted by the user
     * @param n the number of digits the password is supposed to have
     * @return true or false if password has a certain amount of digits
     */
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
