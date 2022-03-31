package string;

import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){

            }else{
                System.out.println("The string does not  contain only digits");
                return;
            }
        }
        System.out.println("The string contains only digits");
    }
}
