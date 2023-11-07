package Operators;

public class Question14 {
    public static void main(String args[]) {
        int num = 1234;
        int lastdigit = num % 10;
        num /= 10;
        int secondlastdigit = num % 10;
        num /= 10;
        int seconddigit = num % 10;
        num /= 10;
        int fastdigit = num % 10;
        num /= 10;
        fastdigit += 2;
        seconddigit += 2;
        secondlastdigit += 2;
        lastdigit += 2;
        int result = (fastdigit * 1000) + (seconddigit * 100) + (secondlastdigit * 10) + (lastdigit * 1);
        System.out.println(result);
    }

}
