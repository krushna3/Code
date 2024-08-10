
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        //object creation- class_name object_name = new class_name();
        Bank Account_1 = new Bank();
        Bank Account_2 = new Bank();
        Bank Account_3 = new Bank();

        Scanner sc = new Scanner(System.in);

        //Account_1
        Account_1.Bank_Name = "SBI";
        Account_1.Ifsc = "SB258963";
        Account_1.Branch_Name = "BBSR";
        Account_1.Account_No = 523698412;
        Account_1.Account_Name = "SOUMYA SWARUP";
        Account_1.Balance = 8956236;
        Account_1.User_Id = "soumya1122";
        Account_1.Password = "swarup03";

        //Account_2
        Account_2.Bank_Name = "ICICI";
        Account_2.Ifsc = "ICIC0001234";
        Account_2.Branch_Name = "ctc";
        Account_2.Account_No = 523698412;
        Account_2.Account_Name = "KRUSHNA KRISH";
        Account_2.Balance = 22356236;
        Account_2.User_Id = "KRISH@22";
        Account_2.Password = "KRUSHNA33";

        //Account_3
        Account_3.Bank_Name = "HDFC";
        Account_3.Ifsc = "HDFC0001234";
        Account_3.Branch_Name = "BBSR";
        Account_3.Account_No = 623698412;
        Account_3.Account_Name = "SOMESH DALAI";
        Account_3.Balance = 1000056236;
        Account_3.User_Id = "somesh3366";
        Account_3.Password = "dalai53";

        System.out.println("DO YOU WANT TO FETCH YOUR ACCOUNT DETAILS ? \n PLEASE ENTER YOUR User Id :");
        String Temp_User_Id = sc.nextLine();
        System.out.println("PLEASE ENTER YOUR PASSWORD :");
        String Temp_Password = sc.nextLine();

        if (Temp_User_Id.equals( Account_1.User_Id )&& Temp_Password.equals(Account_1.Password)) {
            System.out.println("YOUR ACCOUNT DETAILS ARE :");
            System.out.println("NAME : " + Account_1.Account_Name);
            System.out.println("ACCOUNT NO : " + Account_1.Account_No);
            System.out.println("BANK NAME : " + Account_1.Bank_Name);
            System.out.println("IFSC : " + Account_1.Ifsc);
            System.out.println("BRANCH NAME : " + Account_1.Branch_Name);
            System.out.println("BALANCE : " + Account_1.Balance);
            System.out.println("USER ID : " + Account_1.User_Id);
            System.out.println("PASSWORD : " + Account_1.Password);
        }else if(Temp_User_Id.equals(Account_2.User_Id) && Temp_Password.equals(Account_2.Password)){
            System.out.println("YOUR ACCOUNT DETAILS ARE :");
            System.out.println("NAME : " + Account_2.Account_Name);
            System.out.println("ACCOUNT NO : " + Account_2.Account_No);
            System.out.println("BANK NAME : " + Account_2.Bank_Name);
            System.out.println("IFSC : " + Account_2.Ifsc);
            System.out.println("BRANCH NAME : " + Account_2.Branch_Name);
            System.out.println("BALANCE : " + Account_2.Balance);
            System.out.println("USER ID : " + Account_2.User_Id);
            System.out.println("PASSWORD : " + Account_2.Password);
        }else if(Temp_User_Id.equals(Account_3.User_Id) && Temp_Password.equals(Account_3.Password)){
            System.out.println("YOUR ACCOUNT DETAILS ARE :");
            System.out.println("NAME : " + Account_3.Account_Name);
            System.out.println("ACCOUNT NO : " + Account_3.Account_No);
            System.out.println("BANK NAME : " + Account_3.Bank_Name);
            System.out.println("IFSC : " + Account_3.Ifsc);
            System.out.println("BRANCH NAME : " + Account_3.Branch_Name);
            System.out.println("BALANCE : " + Account_3.Balance);
            System.out.println("USER ID : " + Account_3.User_Id);
            System.out.println("PASSWORD : " + Account_3.Password);
        }
        else{
            System.out.println("INVALID USER ID OR PASSWORD");
           
        }
    }
}
