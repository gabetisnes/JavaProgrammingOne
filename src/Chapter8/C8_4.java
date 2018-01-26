package Chapter8;

import java.util.Scanner;

/**
 * Program for finding the total amount of days and hours
 *
 * @author Gabriel Tisnes
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int[][] hours = {
            {2, 4, 3, 4, 5, 8, 8, 34},
            {7, 3, 4, 3, 3, 4, 4, 28},
            {3, 3, 4, 3, 3, 2, 2, 20},
            {9, 3, 4, 7, 3, 4, 1, 31},
            {3, 5, 4, 3, 6, 3, 8, 32},
            {3, 4, 4, 6, 3, 4, 4, 28},
            {3, 7, 4, 8, 3, 8, 4, 37},
            {6, 3, 5, 9, 2, 7, 9, 41}};

        int w = 0;
        System.out.println("          Su    M     T    W     Th	 F 	Sa    Total");
        int x = 0;
        while (x < 8) {
            System.out.print("\nEmployee" + x + "  ");
            for (int i = 0; i < 8; i++) {
                System.out.print(hours[w][i] + "     ");
            }
            w += 1;
            x += 1;

        }
    }

}
