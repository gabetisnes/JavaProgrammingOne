package Chapter7;

import java.util.Scanner;

/**
 * Program for user to show students' grades
 *
 * @author Gabriel Tisnes
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = in.nextInt();
        int[] scores = new int[numberOfStudents];

        System.out.print("Enter " + numberOfStudents + " scores: ");
        for (int i = 0; i < scores.length; ++i) {
            scores[i] = in.nextInt();
        }

        showGrades(scores);

    }

    /**
     * Method to show grades
     *
     * @param grades arguments from command line prompt
     */
    public static void showGrades(int[] grades) {
        int highScore = bestGrade(grades);

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Student %d score is %d and grade is %s%n", i, grades[i], assignLetterGrade(grades[i], highScore));
        }
    }

    /**
     * Method to assign letter grades
     *
     * @param grade is used for the user's grade
     * @param highScore is used for the high score in the equation
     */
    public static char assignLetterGrade(int grade, int highScore) {

        if (highScore - grade <= 10) {
            return 'A';
        } else if (highScore - grade > 10 && highScore - grade <= 20) {
            return 'B';
        } else if (highScore - grade > 20 && highScore - grade <= 30) {
            return 'C';
        } else if (highScore - grade > 30 && highScore - grade <= 20) {
            return 'D';
        } else {
            return 'F';
        }
    }

    /**
     * Method to get the best grade
     *
     * @param grades returns the highest grade
     */
    public static int bestGrade(int[] grades) {
        int highScore = grades[0];

        for (int grade : grades) {
            if (grade > highScore) {
                highScore = grade;
            }
        }

        return highScore;

    }
}
