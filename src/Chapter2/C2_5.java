package Chapter2;

import java.util.Scanner;

/**
 * Program allows user to enter a subtotal and gratuity rate to show a total and
 * gratuity money
 *
 * @author Gabriel Tisnes
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity
                + " and total is $" + total);
    }

}
