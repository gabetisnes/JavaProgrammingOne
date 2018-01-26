package Chapter3;

import java.util.Scanner;

/**
 * Program used to figure out if a number is divisible
 *
 * @author Gabriel Tisnes
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //this statement asks the computer to ask the user for input to later plug in an equation
        System.out.println("Enter a number: ");
        int numberDivisible = input.nextInt();

        //this part of the code asks if the number is divisble by 5 and 6
        if (((numberDivisible % 5) == 0.0) && (((numberDivisible % 6) == 0))) {
            System.out.println("Is " + numberDivisible + " divisible by 5 and 6? True!");
        } else {
            System.out.println("Is " + numberDivisible + " divisible by 5 and 6? False");
        }

        //this part of the code just asks if the number is divisible by 5 or 6
        if (((numberDivisible % 5) == 0.0) || (((numberDivisible % 6) == 0))) {
            System.out.println("Is " + numberDivisible + " divisible by 5 or 6? True!");
        } else {
            System.out.println("Is " + numberDivisible + " divisible by 5 or 6? False");
        }

        //this code below tells the program to put the input to see if it is divisible by 5 or 6 but not both
        if ((((numberDivisible % 5) == 0.0) || (((numberDivisible % 6) == 0))) ^ (((numberDivisible % 5) == 0.0) && (((numberDivisible % 6) == 0)))) {
            System.out.println("Is " + numberDivisible + " divisible by 5 or 6, but not both? True!");
        } else {
            System.out.println("Is " + numberDivisible + " divisible by 5 or 6, but not both? False!");
        }

    }

}
