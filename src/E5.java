import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class E5 {
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Please enter ten numbers:");
        ArrayList<Integer> oddArr= new ArrayList<Integer>();
        ArrayList<Integer> evenArr= new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            int userInput=keyboard.nextInt();
            if (userInput%2==0){
                evenArr.add(userInput);
            }else {
                oddArr.add(userInput);
            }
        }System.out.print("The even numbers are: "+evenArr+"\n");
        System.out.print("The odd numbers are: "+oddArr);
    }
}
