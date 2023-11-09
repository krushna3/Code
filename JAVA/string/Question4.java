package string;
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args){
        // String word = "umbrella";
        // System.out.println(word.indexOf("e"));
        Scanner printout = new Scanner(System.in);
        System.out.println("Please entre a word");
        String    X      = printout.nextLine();
        System.out.println("please entre word you want to search");
        String          Y      = printout.nextLine();
                  System.out.println("this word is "+Y+" in the position of " +X.indexOf(Y));
 }
    
}
