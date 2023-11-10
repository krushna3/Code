package String;
import java.util.Scanner;

public class Question4 {
    public static void main(String args[]){
        // String word = "Umbrella";
        // System.out.println(word.indexOf("e"));
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a word ");
        String wordName = sc.nextLine();
        System.out.println("please enter a word to search ");
        String searchWordName = sc.nextLine();
        System.out.println("The word " + searchWordName + " is in the position of " + wordName.indexOf(searchWordName));

    }
    
}
