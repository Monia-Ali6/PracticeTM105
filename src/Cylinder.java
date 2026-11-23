import java.util.Scanner;
public class Cylinder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double r, h, volume;
        System.out.print("Enter the radius: ");
        r = input.nextDouble();
        System.out.print("Enter the height: ");
        h = input.nextDouble();

        volume = Math.PI * Math.pow(r,2) * h;
        System.out.printf("The volume is: %.2f%n", volume);

        if (volume > 500){
            System.out.println("The cylinder is large");
        }
        else {
            System.out.println("The cylinder is small");
        }
    }
}


        /*
        Scanner input = new Scanner(((System.in)));
        int n;
        System.out.print("Enter an integer: ");
        n = input.nextInt();
        System.out.println((7+13) %2);


       for (int i = 5; i <= n; i += 5){
           System.out.print(i + " ");
       }
        /
        int n;
        System.out.print("Enter a positive number: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }



        double gpa;
        int warnings;

        System.out.print("Enter you gpa: ");
        gpa = input.nextDouble();

        if (gpa < 0 || gpa > 4){
            System.out.println("Enter a valid gpa");
        }
        else{
            if (gpa >= 2){
                System.out.print("Regular");
            }
            else {
                System.out.print("Enter the number of warnings: ");
                warnings = input.nextInt();
                if (warnings < 5){
                    System.out.println("Warned");
                }
                else{
                    System.out.println("Dismissed");
                }
            }
        }





        /*
        String word;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a word: ");
            word = input.next();
            if (word.charAt(0) == 'A' || word.charAt(0) == 'a') {
                System.out.println("The word " + word + " starts with 'A/a'");
            } else {
                System.out.println("The word " + word + " does NOT start with an A/a");
            }
        }




        /*
        int num1, num2;

        System.out.print("Enter 2 positive integers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        if (num1 % num2 == 0){
            System.out.printf("%d is a multiple of %d", num1, num2);
        }
        else{
            System.out.printf("%d is NOT a multiple of %d", num1, num2);
        }


        /*
        for (int i = 0; i < 10; i++){
            System.out.print("Enter an integer: ");
            number = input.nextInt();
            if (number % 2 == 0 && number % 3 == 0){
                System.out.println("The number is divisible by 2 and 3");
            }
            else{
                System.out.println("It is not divisible by 2 and 3");
            }
        }

         */