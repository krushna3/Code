package operators;

public class Question13 {
    public static void main(String[] args){
        int number=64789;
        int lastDigit=64789%10, newnumber=number/10;
        int secondlastDigit= newnumber%10,newNumber1=newnumber/10;
        int thirdDigit=newNumber1%10,newNumber2=newNumber1/10;
        int secondDigit=newNumber2%10,newNumber3=newNumber2/10;
        int firstDigit=newNumber3%10,newNumber4=newNumber3/10;
        System.out.println(firstDigit+secondlastDigit);
    }
    
}
