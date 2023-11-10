package String;

public class Question6 {
    public static void main(String[] args) {
        String word = "mikun";
        String reverseWord = "";
        int length = word.length();
        // int lastindex = length - 1;
         reverseWord += word.charAt(length-1);
        //  int secondlastindex = length -2;
          reverseWord += word.charAt(length -2);
        //   int thirdlastindex = length-3;
          reverseWord += word.charAt(length-3);
        //   int fourthlastindex = length-4;
          reverseWord += word.charAt(length-4);
        //   int fifthlastindex = length-5;
          reverseWord += word.charAt(length-5);
          System.out.println(reverseWord);
        
    }
    
}
