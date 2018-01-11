package Chapter5;

import java.util.Scanner;

/**
 * Program to enter a string and return it backwards
 *
 * @author Gabriel Tisnes
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        System.out.print("Enter a string: ");

        String value = new Scanner(System.in).nextLine();
        reverseDisplay(value);

    }

    private static void reverseDisplay(String value) {
        if (value.length() == 0) {
            return;
        }
        System.out.print(value.substring(value.length() - 1));

        reverseDisplay(value.substring(0, value.length() - 1));
    }

}
