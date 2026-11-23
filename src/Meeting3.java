import java.util.Scanner;

public class Meeting3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        int factorial = 1;

        for (int i = 1; i <= 10; i++){
            factorial *= i;
        }
        System.out.print("Factorial is " + factorial);

        */
        double grade;
        int passes = 0, notPasses = 0;

        for(int i = 1; i <= 15; i++){
            System.out.printf("Enter the grade of student %d: ", i);
            grade = input.nextDouble();
            if(grade < 0 || grade > 100){
                System.out.println("Enter a valid grade");
            }
            else {
                if (grade >= 50) {
                    System.out.println("Pass");
                    passes += 1;
                } else {
                    System.out.println("Fail");
                    notPasses += 1;
                }
            }
        }
        System.out.printf("The number of passed students are: %d%n", passes);
        System.out.printf("The number of failed students are: %d", notPasses);




        /*
        // from 9 to 1
        for(int i = 9; i >= 1; i--){
            System.out.println(i);
        }

        double score;
        System.out.print("Enter your grade: ");
        score = input.nextDouble();

        //java moves line-line from top down so it'll pass 90 then 80
        if(score >= 0 && score <= 100) {
            if (score >= 90) {
                System.out.print("Your grade is an 'A'");
            } else if (score >= 80) {
                System.out.print("Your grade is an 'B'");
            } else if (score >= 70) {
                System.out.print("Your grade is an 'C'");
            } else if (score >= 60) {
                System.out.print("Your grade is an 'D'");
            } else {
                System.out.print("Your grade is an 'F'");
            }
        }
        else{
            System.out.print("Invalid score");
        }

        int number;
        System.out.print("Enter an integer number: ");
        number = input.nextInt();

        if(number > 0){
            System.out.print("Your number is positive.");
        }
        else if(number < 0){
            System.out.print("Your number is negative.");
        }
        else{
            System.out.print("Your number is a 0");
        }



        double numb1, numb2, result = 0;
        char operator;
        boolean isOperator = true;

        System.out.print("Enter first number: ");
        numb1 = input.nextDouble();

        System.out.print("Enter an operator(+, -, *, /, ^): ");
        operator = input.next().charAt(0);

        System.out.print("Enter second number: ");
        numb2 = input.nextDouble();

        switch(operator){
            case '+' -> result = numb1 + numb2;
            case '-' -> result = numb1 - numb2;
            case '*' -> result = numb1 * numb2;
            case '/' -> {
                if (numb2 == 0){
                    System.out.print("Can't divide by 0");
                    isOperator = false;
                    return;
                }
                else {
                    result = numb1 / numb2;
                }
            }
            case '^' -> result = Math.pow(numb1, numb2);
            default -> {
                System.out.print("Invalid operator!");
                isOperator = false;
            }
        }

        if (isOperator){
            System.out.printf("result is %.5f", result);
        }

        // take a note of the && operator
        //redundant checking of operator in every if statement
        if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '^') {
            if (operator == '+'){
                result = numb1 + numb2;
            }
            else if (operator == '-'){
                result = numb1 - numb2;
            }
            else if (operator == '*'){
                result = numb1 * numb2;
            }
            else if ((operator == '/') && (numb2 != 0)){
                result = numb1 / numb2;
            }
            else if (operator == '^'){
                result = Math.pow(numb1,numb2);
            }
            else {
                System.out.print("No 0 in the second number!");
                return;
            }
            System.out.printf("%.1f %c %.1f is equal to %.1f", numb1, operator, numb2, result);
        }
        else {
            System.out.print("Enter a valid operator");
        }
         */
        input.close();
    }
}
