package Chapter3;

import java.util.Scanner;

/**
 * Program to figure out which number is bigger and the grade it is
 *
 * @author Gabriel Tisnes
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get a number from user
        System.out.println("Enter a number: ");
        double number1 = input.nextDouble();

        //get a number from user
        System.out.println("Enter another number: ");
        double number2 = input.nextDouble();

        //compares the users inputs to each other
        if (number1 < number2) {
            System.out.println("The first number is less than second");
        } else if (number1 > number2) {
            System.out.println("The first number is greater than the second");
        } else {
            System.out.println("The first number is equal to the second");
        }

        //this part compares if the number are less than or more than and eqaul to each other. 
        if (number1 <= number2) {
            System.out.println("The first number is less than or equal to the second");
        } else {
            System.out.println("The first number is not equal to the second");
        }

        //checks to see if the number is zero
        if (number2 == 0.0) {
            System.out.println("Cannot divide by zero");
        } else if ((number1 / number2) < 1.0) {
            System.out.println("Proper fraction");
        } else {
            System.out.println("Improper fraction");
        }
        //cecks the division of the numbers is correct

        //checks to see what number1's grade is
        if (number1 >= 90.0) {
            System.out.println("A");
        } else if (number1 >= 80.0) {
            System.out.println("B");
        } else if (number1 >= 70.0) {
            System.out.println("C");
        } else if (number1 >= 60.0) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        //this part compares the range of the number
        if ((number2 >= 1) && (number2 <= 100)) {
            System.out.println("In Range");
        } else {
            System.out.println("Out of Range");
        }
    }
}
