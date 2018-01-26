package Chapter4;

import java.util.Scanner;

/**
 * Program to decide if s1 is a substring to s2
 *
 * @author Gabriel Tisnes
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter string s1: ");
        String s1 = input.next();
        s1 = s1.toUpperCase();
        System.out.println("Enter string s2: ");
        String s2 = input.next();
        s2 = s2.toUpperCase();

        if (s1.contains(s2)) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring " + s1);
        }
    }

}
