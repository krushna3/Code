package operators;

public class Question16 {
    public static void main(String[] args){
        int num=234;
        int lastDigit=num%10,num1=num/10;
        int secondDigit=num1%10,num2=num1/10;
        int firstDigit=num2%10,num3=num2/10;

        System.out.println((lastDigit*100)+(secondDigit*10)+(firstDigit*1));
    }
    
}
