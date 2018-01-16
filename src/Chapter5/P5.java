package Chapter5;

import java.util.Scanner;

/**
 * Program for user to enter 'yes' or 'no' votes and then total them
 *
 * @author Gabriel Tisnes
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting");
        System.out.println("Enter your vote: ");
        String sVote = input.next().toUpperCase();

        int yesVotes = 0;
        int noVotes = 0;
        int invalidVotes = 0;

        while (!sVote.equals("Q")) {
            if (sVote.equals("Y")) {
                ++yesVotes;
            } else if (sVote.equals("N")) {
                ++noVotes;
            } else {
                System.out.println("INVALID CODE: Enter 'Y' to vote yes, and 'N' to vote no, or 'Q' to quit voting");
                ++invalidVotes;
            }
            System.out.println("Enter your vote: ");
            sVote = input.next().toUpperCase();
        }
        int TotalVotes = invalidVotes + noVotes + yesVotes;
        System.out.println("Amount of Yes votes: " + yesVotes);
        System.out.println("Amount of No votes: " + noVotes);
        System.out.println("Invalid votes: " + invalidVotes);
        System.out.println("Total votes: " + TotalVotes);
    }
}
