import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, highEarners = 0;
        double salary, bonus = 0.0, sum = 0.0, highest = 0.0, average;
        System.out.print("Enter number of employees: ");
        n = input.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print("Enter salary: ");
            salary = input.nextDouble();
            if (salary > highest){
                highest = salary;
            }
            if (salary > 5000){
                highEarners++;
            }
            if (salary < 4000){
                bonus += salary * 0.1;
            }
            sum += salary;
        }

        average = sum / n;
        System.out.printf("Highest salary: %.2f%n", highest);
        System.out.printf("Average salary: %.2f%n", average);
        System.out.printf("Employees earning more than 5000: %d%n", highEarners);
        System.out.printf("Total Bonus: %.2f%n", bonus);
    }
}