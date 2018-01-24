package Chapter7;

import java.util.Scanner;

/**
 * Program for
 *
 * @author Gabriel Tisnes
 */
public class P7 {
    
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
      public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many numbers will be read: ");
        int[] numbersRead = new int[input.nextInt()];

        System.out.println("Enter " + numbersRead.length + " elements: ");
        Scanner reader = new Scanner(System.in);

        method2(numbersRead, reader);
        System.out.println(("The average is ") + method3(numbersRead));
        method1(numbersRead);
    }
      
    /**
     * Main Method
     *
     * @param num arguments from command line prompt
     */

    public static void method1(int[] num) 
    {
        System.out.println("The contents of the array: \n " + java.util.Arrays.toString(num));
    }
    
    public static void method2(int[] numbers, Scanner input) 
    {
        for (int i = 0; i < numbers.length; i++) 
        {
            numbers[i] = (int) input.nextDouble();
        }
    }

    public static double method3(int[] numbers) 
    {
        double numbersSum = 0;
        
        for (int i = 0; i < numbers.length; i++) 
        {
            numbersSum += numbers[i];
        }
        
        double combinedAverage;
        
        combinedAverage = numbersSum / numbers.length;
        
        return combinedAverage;
    }
}