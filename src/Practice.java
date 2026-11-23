import java.util.Scanner;
public class Practice {
    public static String shortestString(String[] wordsArray) {
        String mostShort = wordsArray[0];
        for (int i = 1; i < wordsArray.length; i++) {
            if (wordsArray[i].length() < mostShort.length()) {
                mostShort = wordsArray[i];
            }
        }
        return mostShort;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] wordsArray = new String[5];
        System.out.println("Enter 5 words:");
        for (int i = 0; i < wordsArray.length; i++) {
            wordsArray[i] = input.next();
        }
        System.out.println("The shortest word is: " + shortestString(wordsArray));
    }
}
