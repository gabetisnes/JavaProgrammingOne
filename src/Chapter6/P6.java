package Chapter6;

import java.util.Scanner;
import java.text.*;

/**
 * Program to convert currency
 *
 * @author Gabriel Tisnes
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many Euros does a dollar buy? ");
        double Euro = input.nextDouble();

        System.out.print("How many Pound Sterling does a dollar buy? ");
        double Pound = input.nextDouble();

        System.out.print("How many Yen does a dollar buy? ");
        double Yen = input.nextDouble();

        System.out.print("Please enter the number of dollars you want to convert: $");
        double numberOfDollars = input.nextDouble();

        System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds or \"Y\" to buy Yen: ");
        String Currency = input.next();

        CurrrencyConversion(Currency, numberOfDollars, Yen, Pound, Euro, input);
    }

    /**
     * Method to convert currency to dollars
     *
     * @param numberOfDollars the amount of dollars we are converting
     * @param Yen the amount of yen we are converting
     * @param Pound the amount of pounds we are converting
     * @param Euro
     */
    public static void CurrrencyConversion(String Currency, double numberOfDollars, double Yen, double Pound, double Euro, Scanner input) {

        DecimalFormat d2 = new DecimalFormat("0.00");
        boolean conti = false;
        double euros1 = 0, pound1 = 0, yen1 = 0, euros2 = 0, pound2 = 0, yen2 = 0;

        if (Currency.equalsIgnoreCase("E") && numberOfDollars <= 100) {
            euros1 = (numberOfDollars * Euro) - ((numberOfDollars * Euro) * 0.10);
            System.out.println("For " + numberOfDollars + " dollars, you will be able to buy " + d2.format(euros1) + " Euros");

        }

        if (Currency.equalsIgnoreCase("E") && numberOfDollars > 100) {
            euros2 = (numberOfDollars * Euro) - ((numberOfDollars * Euro) * 0.05);
            System.out.println("For " + numberOfDollars + " dollars, you will be able to buy " + d2.format(euros2) + " Euros");

        }

        if (Currency.equalsIgnoreCase("P") && numberOfDollars <= 100) {
            pound1 = (numberOfDollars * Pound) - ((numberOfDollars * Pound) * 0.10);
            System.out.println("For " + numberOfDollars + " dollars, you will be able to buy " + d2.format(pound1) + " Pound Sterlings");
        }

        if (Currency.equalsIgnoreCase("P") && numberOfDollars > 100) {
            pound2 = (numberOfDollars * Pound) - ((numberOfDollars * Pound) * 0.05);
            System.out.println("For " + numberOfDollars + " dollars, you will be able to buy " + d2.format(pound2) + " Pound Sterlings");
        }

        if (Currency.equalsIgnoreCase("Y") && numberOfDollars <= 100) {
            yen1 = (numberOfDollars * Yen) - ((numberOfDollars * Yen) * 0.10);
            System.out.println("For " + numberOfDollars + " dollars, you will be able to buy " + d2.format(yen1) + " Yen");
        }

        if (Currency.equalsIgnoreCase("Y") && numberOfDollars > 100) {
            yen2 = (numberOfDollars * Yen) - ((numberOfDollars * Yen) * 0.05);
            System.out.println("For " + numberOfDollars + " dollars, you will be able to buy " + d2.format(yen2) + " Yen");
        }

        System.out.print("Are there more conversions to perform? ");
        String yesOrNo = input.next();

        if (!(yesOrNo.equalsIgnoreCase("yes")) && !(yesOrNo.equalsIgnoreCase("no")));
        while (!(yesOrNo.equalsIgnoreCase("yes")) && !(yesOrNo.equalsIgnoreCase("no"))) {
            System.out.print("Are there more conversions to perform? ");
            yesOrNo = input.next();

            if (yesOrNo.equalsIgnoreCase("yes")) {

                System.out.print("Please enter the number of dollars you want to convert: $");
                double ammt = input.nextDouble();
                System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds or \"Y\" to buy Yen: ");
                CurrrencyConversion(input.next(), ammt, Yen, Pound, Euro, input);

            }

            if (yesOrNo.equalsIgnoreCase("no")) {
                System.exit(0);
            }
        }

        for (int x = 0; x < 1; ++x) {
            if (yesOrNo.equalsIgnoreCase(("yes"))) {
                System.out.print("Please enter the number of dollars you want to convert: $");
                double ammt = input.nextDouble();
                System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds or \"Y\" to buy Yen: ");
                CurrrencyConversion(input.next(), ammt, Yen, Pound, Euro, input);
            } else if (yesOrNo.equalsIgnoreCase("no")) {
                System.exit(0);
            }
        }

    }
}
