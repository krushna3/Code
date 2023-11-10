package string;
// import java.util.Scanner;
public class Question5 {
    public static void main(String[] args){
        // Scanner printout = new Scanner(System.in);
        
        String word = "Biswa",
        revrsWord = "";
        // int length =word.length(),
        // lastIndex  =length-1;
        int lastIndex = word.length() - 1;
        // char lastChar=word.charAt(lastIndex);
        // revrsWord += lastChar;
        revrsWord += word.charAt(lastIndex);
        // int secondLastIndex = lastIndex - 1;
        lastIndex -= 1; // lastIndex--;
        // char secondLastChar=word.charAt(secondLastIndex);
        // revrsWord += secondLastChar;
        revrsWord += word.charAt(lastIndex);
        // int midlleIndex = secondLastIndex - 1;
        lastIndex -=1; //lastindex--;
        // char midlleChar = word.charAt(midlleIndex);
        // revrsWord += midlleChar;
        revrsWord += word.charAt(lastIndex);
        // int secondIndex = midlleIndex - 1;
        lastIndex -=1;
        // char secondChar =word.charAt(secondIndex);
        // revrsWord += secondChar;
        revrsWord += word.charAt(lastIndex);
        // int firstindex = secondIndex - 1;
        lastIndex --; 
        // char firstChar = word.charAt(firstindex);
        // revrsWord += firstChar;
        revrsWord += word.charAt(lastIndex);
        System.out.println(revrsWord);
    }
    
}
