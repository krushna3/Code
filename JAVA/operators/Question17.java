package operators;

public class Question17 {
    public static void main(String[] args){
        int num=548;
        int newNum=0;
        int lastDigit=num%10;
        num=num/10;
        newNum=(newNum*10)+lastDigit;
        int secondDigit=num%10;
        num=num/10;
         newNum=(newNum*10)+secondDigit;
        int firstDigit=num%10;
         newNum=(newNum*10)+firstDigit;
        System.out.println(newNum);
    }
    
}
