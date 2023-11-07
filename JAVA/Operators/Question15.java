package Operators;

public class Question15 {
    public static void main(String args[]) {
        int num = 132;
        int lastdigit = num % 10;
        num /= 10;
        int seconddigit = num % 10;
        num /= 10;
        int fastdigit = num % 10;
        num /= 10;
        System.out.println(fastdigit + seconddigit + lastdigit);

    }

}
