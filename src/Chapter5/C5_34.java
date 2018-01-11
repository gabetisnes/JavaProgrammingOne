package Chapter5;

import java.util.Scanner;

/**
 * Program to
 *
 * @author Gabriel Tisnes
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("scissor (0), rock (1), paper (2): ");
        int uGuess = input.nextInt();

        int cpuGuess = (0 + (int) Math.random() * 3);
        System.out.println("Cpu guess: " + cpuGuess);

        int userScore = 0;
        int cpuScore = 0;

        while ((cpuScore < 2) && (userScore < 2)) {
            if ((uGuess == 0) && (cpuGuess == 1)) {
                System.out.println("You lost");
                ++userScore;
            } else if ((uGuess == 0) && (cpuGuess == 2)) {
                System.out.println("You won");
                ++cpuScore;
            } else if ((uGuess == 0) && (cpuGuess == 0)) {
                System.out.println("It is a draw");
            } else if ((uGuess == 1) && (cpuGuess == 0)) {
                System.out.println("You won");
                ++cpuScore;
            } else if ((uGuess == 1) && (cpuGuess == 2)) {
                System.out.println("You lost");
                ++userScore;
            } else if ((uGuess == 1) && (cpuGuess == 1)) {
                System.out.println("It is a draw");
            } else if ((uGuess == 2) && (cpuGuess == 0)) {
                System.out.println("You lost");
                ++userScore;
            } else if ((uGuess == 2) && (cpuGuess == 1)) {
                System.out.println("You won");
                ++cpuScore;
            } else if ((uGuess == 2) && (cpuGuess == 2)) {
                System.out.println("It is a draw");
            } else {
                System.out.println("Invalid Input. Try Again");
            }

            System.out.printf("scissor (0), rock (1), paper (2): ");
            uGuess = input.nextInt();

            cpuGuess = (int) (1 + Math.random() * 2);
            System.out.println("Cpu guess: " + cpuGuess);
        }

        if (userScore > cpuScore) {
            System.out.println("The computer won more than two times");
        } else {
            System.out.println("The user won more than two times");
        }

        System.out.println("User score " + cpuScore);
        System.out.println("CPU score  " + userScore);
    }

}
