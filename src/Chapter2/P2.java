package Chapter2;

import java.util.Scanner;

/**
 * Program changes Celsius to Fahrenheit
 *
 * @author Gabriel Tisnes
 */

public class P2 {

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
