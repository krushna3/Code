package Operators;

public class Question13 {
    public static void main(String args[]) {
        int num = 12345;
        int lastdigit = num % 10; // num=12345, lastdigit=5;
        num /= 10; // num=1234;lastdigit=5; num/=10
        int secondlastdigit = num % 10; // num=1234, lastdigit=5,seconlastdigit=4;
        num /= 10;
        int thirdlastdigit = num % 10;
        num /= 10;
        int seconddigit = num % 10;
        num /= 10;
        int fastdigit = num % 10;
        num /= 10;

        System.out.println(fastdigit + secondlastdigit);

    }

}
