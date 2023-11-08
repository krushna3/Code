package String;

import java.util.Scanner;

public class Question3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a word");
        String sentence = sc.nextLine();
        System.out.println("The lenght of " + sentence + " is " + sentence.length());
    }

}
