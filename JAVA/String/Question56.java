package String;

public class Question56 {
    public static void main(String[] args) {
        String word = "mikun";
        String reverseWord = "";
        int length = word.length();
        // int lastindex = length -1;
        // char lastchar = word.charAt(lastindex);
        reverseWord += word.charAt(--length);
        reverseWord += word.charAt(--length);
        reverseWord += word.charAt(--length);
        reverseWord += word.charAt(--length);
        reverseWord += word.charAt(--length);
        System.out.println(reverseWord);

    }

}
