package Chapter8;

import java.util.Scanner;

/**
 * Program to find out the sales man's sales
 *
 * @author Gabriel Tisnes
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] sale = new double[4][5];

        String response = "y";

        do {
            int x = 0;
            int y = 0;

            //user input
            System.out.println("Enter the salesman ID as A, B, C, or D: ");
            String employee = input.next();

            //conditions
            if (employee.equals("A")) {
                x = 0;
            } else if (employee.equals("B")) {
                x = 1;
            } else if (employee.equals("C")) {
                x = 2;
            } else if (employee.equals("D")) {
                x = 3;
            }

            //user input
            System.out.println("Enter the day as M, T, W, H, or F: ");
            employee = input.next();

            switch (employee) {
                case "M":
                    y = 0;
                    break;
                case "T":
                    y = 1;
                    break;
                case "W":
                    y = 2;
                    break;
                case "H":
                    y = 3;
                    break;
                case "F":
                    y = 4;
                    break;
                default:
                    break;
            }

            System.out.println("Enter the amount of the sale: ");
            double number = input.nextDouble();

            sale[x][y] += number;
            System.out.println("More data? Enter Y for more or N to stop.");
            response = input.next().toLowerCase();

        } //while yes then continue repeating
        while (response.equals("y"));

        for (int p = 0; p < 4; ++p) {
            for (int s = 0; s < 5; ++s) {
                System.out.print(sale[p][s]);
            }
            System.out.println();
        }

    }
}
