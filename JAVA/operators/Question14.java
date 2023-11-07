package operators;

public class Question14 {
    public static void main(String[] args){
        int number=2345;
        int lastDigit=number%10,number1=number/10;
        int thirdDigit=number1%10,number2=number1/10;
        int secondDigit=number2%10,number3=number2/10;
        int firstDigit=number3%10,number4=number3/10;
        // System.out.println((firstDigit += 2) +""+ (secondDigit+=2) +""+ (thirdDigit+=2) +""+ (lastDigit+2));
    // this out put is in string
    int result=(firstDigit+=2)*1000+(secondDigit+=2)*100+(thirdDigit+=2)*10+(lastDigit+=2)*1;
    System.out.println(result);
    }
}