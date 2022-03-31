package assignment1;

import java.util.Scanner;

public class main25 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        System.out.println("The string is"+s+" , its reverse is "+res);
    }
}
