package Chapter3;

import java.util.Scanner;

/**
 * Program asks the user for input in a game of heads or tails
 *
 * @author Gabriel Tisnes
 */

public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Heads or Tails?");
        System.out.println("Heads = 0 and Tails = 1");
        int guess = input.nextInt();

        int CPUguess = (int) (Math.random() * 2);
        System.out.println(CPUguess);
        if (guess == CPUguess) {
            System.out.println("You won");
        } else {
            System.out.println("You lost");
        }

    }

}
