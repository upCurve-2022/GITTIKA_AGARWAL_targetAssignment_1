package javaChallenges;

import java.util.Scanner;

public class program20 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        System.out.println("The original string is : "+s);
        System.out.println("The new String is: "+ replace(s));
    }

    private static String replace(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                res+='$';
            }else{
                res+=s.charAt(i);
            }

        }
        return res;
    }
}
