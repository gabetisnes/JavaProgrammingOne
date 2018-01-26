package Chapter2;

import java.util.Scanner;

/**
 * Program allows user to enter radius and length to show an area and volume
 *
 * @author Gabriel Tisnes
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = input.nextDouble();

        System.out.println("Enter length: ");
        double length = input.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;
        System.out.println("The area is:" + area);
        System.out.println("The volume is:" + volume);

    }

}
