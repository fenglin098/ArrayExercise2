import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class E5 {
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Please enter ten numbers:");
        int userInput=keyboard.nextInt();
        int[] numArray=new int[10];
        ArrayList<Integer> oddArr= new ArrayList<Integer>();
        ArrayList<Integer> evenArr= new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            numArray[i]=userInput;
            if (numArray[i]%2==0){
                evenArr.add(numArray[i]);
            }else {
                oddArr.add(numArray[i]);
            }for (int e:evenArr) {
                System.out.println("The even numbers are: "+e);
            }for (int o:oddArr){
                System.out.println("The odd numbers are: "+o);
            }
        }

    }
}
