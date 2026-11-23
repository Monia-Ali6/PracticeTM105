import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // area of a triangle
        // square root(s(s-a)(s-b)(s-c)) , s = (a+b+c)/2

        //Reads from the user 3 int values a,b,c that are sides
        int a, b, c;
        double area, perimeter, s;

        System.out.print("What is a positive value for side a?: ");
        a = input.nextInt();

        System.out.print("What is a positive value for side b?: ");
        b = input.nextInt();

        System.out.print("What is a positive value for side c?: ");
        c = input.nextInt();

        if (a < 0 || b < 0 || c < 0){
            System.out.println("Invalid Inputs");
        }
        else{
            s = (a + b + c)/2.0;
            area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
            perimeter = a + b + c;
            System.out.printf("The Area is: %.2f\n", area);
            System.out.printf("The Area is: %.2f\n", perimeter);
        }

            input.close();
    }
}
