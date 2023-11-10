package String;

import java.util.Scanner;

public class Question5 {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // String wordname = sc.nextLine();
        String wordname = "mikun";
        String rev = "";
        int length = wordname.length();
        int lastindex = length - 1;
        // char lastchar = wordname.charAt(lastindex);
        rev += wordname.charAt(lastindex);
        int secondlastindex = length -2;
        // char secondlastchar = wordname.charAt(secondlastindex);
        rev += wordname.charAt(secondlastindex);
        int thirdlastindex = length - 3;
        // char thirdlastchar = wordname.charAt(thirdlastindex);
        rev += wordname.charAt(thirdlastindex);
        int fourthlastindex = length - 4;
        // char fourthlastchar = wordname.charAt(fourthlastindex);
        rev += wordname.charAt(fourthlastindex);
        int fifthlastindex = length - 5;
        // char fifthlastchar = wordname.charAt(fifthlastindex);
        rev += wordname.charAt(fifthlastindex);
        System.out.println(rev);
        // System.out.println(lastchar);
        // System.out.println(secondlastchar);
        // System.out.println(thirdlastchar);
        // System.out.println(fourthlastchar);
        // System.out.println(fifthlastchar);
        // String rev = "";
        // rev += lastchar;
        // rev += secondlastchar;
        // rev += thirdlastchar;
        // rev += fourthlastchar;
        // rev += fifthlastchar;
        // System.out.println(lastchar + "" + secondlastchar + "" + thirdlastchar + "" + fourthlastchar + "" + fifthlastchar);
        // System.out.println(lastchar + "" + secondlastchar + thirdlastchar + fourthlastchar + fifthlastchar);

    }

}
