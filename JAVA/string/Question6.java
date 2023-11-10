package string;

public class Question6 {
    public static void main(String[] args) {
        String word = "sushree",
                reversWord = "";
        int length = word.length(),
                lastIndex = length - 1;
        reversWord += word.charAt(lastIndex--);
        // lastIndex--;
        reversWord += word.charAt(lastIndex--);
        // lastIndex--;
        reversWord += word.charAt(lastIndex--);
        // lastIndex -= 1;
        reversWord += word.charAt(lastIndex--);
        // lastIndex--;
        reversWord += word.charAt(lastIndex--);
        // lastIndex -= 1;
        reversWord += word.charAt(lastIndex--);
        // lastIndex--;
        reversWord += word.charAt(lastIndex);
        // System.out.println(reversWord == word);
        System.out.println(reversWord);

    }

}
