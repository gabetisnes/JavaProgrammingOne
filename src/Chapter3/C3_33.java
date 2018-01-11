package Chapter3;

import java.util.Scanner;

/**
 * Program to figure out which package is better
 *
 * @author Gabriel Tisnes
 */

public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //gets weight
        System.out.println("Enter weight for package 1: ");
        double weight1 = input.nextDouble();
        //gets price
        System.out.println("Enter price for package 1: ");
        double price1 = input.nextDouble();
        //gets weight
        System.out.println("Enter weight for package 2: ");
        double weight2 = input.nextDouble();
        //gets price
        System.out.println("Enter weight for package 2: ");
        double price2 = input.nextDouble();
        //declares new variable & decides the cost per pound
        double costperpound = price1 / weight1;
        double costperpound2 = price2 / weight2;
        //decides which package is better
        if (costperpound > costperpound2) {
            System.out.println("Package 2 is better");
        } else if (costperpound2 > costperpound) {
            System.out.println("Package 1 is better");
        } else {
            System.out.println("Both packages are equally good");
        }

    }

}
