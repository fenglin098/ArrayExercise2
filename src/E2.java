import java.util.ArrayList;
import java.util.Scanner;
public class E2 {
    public static void main(String[] args) {
        System.out.println("Please enter a string: ");
        Scanner keyboard = new Scanner(System.in);
        String userInput=keyboard.next();
        char[] a = userInput.toCharArray();
        int count = 0;
        for (char c : a) {
           count++;
        } System.out.println(count);
    }
}

