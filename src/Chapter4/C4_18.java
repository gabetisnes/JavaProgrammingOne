package Chapter4;

import java.util.Scanner;

/**
 * Program to decide what field and year student is in
 *
 * @author Gabriel Tisnes
 */

public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter M for math, I for information technology, and C for computer science. Then enter a number for your school year: ");
        String status = in.next();

        char major = Character.toUpperCase(status.charAt(0));
        char grade = status.charAt(1);

        String courseName = "";

        String gradeName = "";

        if (major == 'M' || major == 'I' || major == 'C') {
            switch (major) {
                case 'M':
                    courseName = "Mathematics";
                    break;
                case 'C':
                    courseName = "Computer Science";
                    break;
                case 'I':
                    courseName = "Information Technology";
                    break;
                default:
                    break;
            }

            switch (grade) {
                case '1':
                    gradeName = "Freshman";
                    break;
                case '2':
                    gradeName = "Sophmore";
                    break;
                case '3':
                    gradeName = "Junior";
                    break;
                case '4':
                    gradeName = "Senior";
                    break;
                default:
                    System.out.printf("Invalid input");
                    break;
            }
            System.out.printf("%s %s%n", courseName, gradeName);
        }
    }

}
