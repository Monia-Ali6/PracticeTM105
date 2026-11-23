import java.util.Scanner;

public class Chapter5 {
    public static void main (String[] args){
        //declare a 2D array table  of 4 rows and 3 columns and initialize it with values entered by the user
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int[][] table = new int[4][3];
        System.out.println("Enter " + table.length +  " rows and " + table[0].length + " columns.");
        for (int i = 0; i < table.length; i++){
            int rows = 0;
            int columns = 0;
            for (int j = 0; j < table[i].length; j++){
                table[i][j] = input.nextInt();
                sum += table[i][j];
                rows += table[i][j];
            }
            System.out.println("The sum of " + i + "th row is " + rows);
            
        }
        //Sum the columns in an initialized 2D array



        /*
        //Write a Java program to read 100 numbers, print their average, and print how many numbers are above the average
        Scanner input = new Scanner(System.in);
        int [] aList = new int[5];
        int counter = 0, sum = 0;

        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < aList.length; i ++){
            aList[i] = input.nextInt();
            sum += aList[i];
        }
        double average = (double) sum/aList.length;
        for (int i = 0; i < aList.length; i ++){
            if (aList[i] > average){
                counter++;
            }
        }
        System.out.println("The average of these " + aList.length + " numbers is " + average);
        System.out.println("The number of numbers above the average of these " + aList.length + " numbers is " + counter);

         */
    }
}
