package Chapter2;

import java.util.Scanner;

/**
 * Program allows user to enter Celsius to change it to Fahrenheit
 *
 * @author Gabriel Tisnes
 */

public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a degree in Celsius: ");
        double degreeC = input.nextDouble();

        double fahrenheit = (9.0 / 5) * degreeC + 32;
        System.out.println(degreeC + " Celsius is " + fahrenheit + " Fahrenheit");

    }

}
