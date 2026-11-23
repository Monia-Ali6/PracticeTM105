import java.util.Scanner;
public class plt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, friend;
        int counter = 0;

        System.out.print("Please, insert your first name: ");
        name = input.next();

        System.out.println("Please, insert the first names of your friends (enter \"stop\" to stop your program): ");
        friend = input.next();

        while (!friend.equals("stop")){
            if (name.equals(friend)){
                counter++;
            }
            friend = input.next();
        }
        System.out.println(counter + " of your friends their first names are identical to your first name");
    }
}
        /*
        Scanner input = new Scanner(System.in);
        int n, value, counter = 0;
        System.out.print("Enter the number of values: ");
        n = input.nextInt();

        System.out.print("Enter the values: ");
        for (int i = 0; i < n; i++){
            value = input.nextInt();
            if (value % 2 == 0 || value % 3 == 0 ){
                counter ++;
            }
        }
        System.out.println("There are " + counter + " numbers divisible by 2, 3 or both");

        Scanner input = new Scanner(System.in);
        int n;
        double gpa, grade = 0.0;
        System.out.print("Enter the number of students: ");
        n = input.nextInt();

        System.out.print("Enter their GPAs: ");
        for(int i = 1; i <= n; i++){
            gpa = input.nextDouble();
            if(gpa > grade){
                grade = gpa;
            }
        }
        System.out.printf("The highest GPA is: %.2f",grade);


        for(int i = number1; i <= number2; i++){
            if(i%2 == 0){
                sum += i;
            }
        }
        System.out.printf("The sum is: %d", sum);

        /*
        for (int i = 1; i <= 7; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
         */
