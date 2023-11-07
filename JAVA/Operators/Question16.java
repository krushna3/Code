package Operators;

public class Question16 {
    public static void main(String[] args) {
        // int num = 132;
        // int lastdigit = num % 10;
        // num /= 10;
        // int seconddigit = num % 10;
        // num /= 10;
        // int fastdigit = num % 10;
        // num /= 10;
        // System.out.println((lastdigit * 100) + (seconddigit * 10) + (fastdigit * 1));
        int num = 435;
        int newNum = 0;
        newNum = newNum * 10 + num % 10;
        num /= 10;
        newNum = newNum * 10 + num % 10;
        num /= 10;
        newNum = newNum * 10 + num % 10;
        System.out.println(newNum);
    }

}
