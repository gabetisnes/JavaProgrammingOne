package Chapter7;

import java.util.Scanner;

/**
 * Program for user to get the minimum number
 *
 * @author Gabriel Tisnes
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        double[] myList = new double[10];

        System.out.print("Enter " + myList.length + " values: ");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextDouble();
        }

        double min = myList[0];
        int indexOfMin = 0;

        for (int i = 1; i < myList.length; i++) {
            if (myList[i] < min) {
                min = myList[i];
                indexOfMin = i;
            }
        }

        System.out.println("The minimum number is: " + min);
    }
}
