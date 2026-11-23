import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int score;

        System.out.print("Enter the score: ");
        score = input.nextInt();

        if((score < 0) || (score > 100)){
            System.out.print("Invalid score!");
        }
        else{
            if(score < 40){
                System.out.println("AR099");
            }
            else if(score < 60){
                System.out.print("AR101");
            }
            else{
                System.out.print("AR102");
            }
        }
    }
}
