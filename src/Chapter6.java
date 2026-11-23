import java.util.Scanner;
public class Chapter6 {
    public static void main(String[] args){
        //Create and initialize a 2D array of 3 rows and 4 columns of integers by values entered from
        //the user. Then find the sum of the elements in the first row.
        int [][] yew = new int[3][4];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + yew.length + " rows and "+ yew[0].length+" columns");
        for (int i = 0; i < yew.length; i++){
            for (int j = 0; j < yew[0].length; j++){
                yew[i][j] = input.nextInt();
            }
        }
        int sum = 0;
            for (int j = 0; j < yew[0].length; j++){
                sum += yew[0][j];
            }
        }

        /*
        // Create and initialize an array of integers. Then create another array with the same size.
        //After that, the program should copy all the elements of the first array inside the second array
        //in the reverse order.
        int [] irray = {1,4,6,8};
        int [] jrray = new int[4];
        int j = 0;
        for (int i = irray.length - 1; i >= 0; i--){
                jrray[j]=irray[i];
                j++;
        }

        //Create and initialize an array of integers by values entered from the user. Then read from
        //the user a number and search for that number in the array. If the number is found, the
        //program should print its index (the first index is found in); otherwise a suitable message
        //should be printed.
        Scanner input = new Scanner(System.in);
        int [] array =  new int [4];
        System.out.print("Enter " + array.length + " values: ");
        for (int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }
        System.out.print("Enter a number: ");
        int look = input.nextInt();
        int key = -1;
        for (int i = 0; i < array.length; i++){
            if (array[i] == look){
                key = i;
                break;
            }
        }
        if (key != -1){
            System.out.println("the number "+ look + " is in the array at position "+ key);

        }
        else{
            System.out.println("the number is not in the array");
        }

        // Create and initialize an array of 10 positive and negative integers. Then find and print the
        //average of the positive numbers in this array.
        int [] array = {10, -3, 9, -5, 43, -54, 44, 32, -70, 55};
        int sum = 0;
        for (int i  = 0; i < array.length; i++){
            if (array[i] > 0){
                sum += array[i];
            }
        }
        System.out.println("The average of the positive integers is: " + sum/array.length);

        //1.Create and initialize an array of 10 positive integers (Values should not exceed 100). Then
        //find and print the minimum odd value in this array with its index.
        int [] array = {23, 42, 54, 56, 35, 32, 35, 56, 12, 28, 9};
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < min && array[i]%2 != 0){
                min = array[i];
            }
        }
        System.out.print("The min odd number is: " + min);
         */
    }
}
