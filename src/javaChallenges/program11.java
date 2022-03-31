package javaChallenges;

import java.util.Locale;
import java.util.Scanner;

public class program11 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s= scn.nextLine();
        System.out.println("Original string : "+s);
        System.out.println("New String : "+upper(s));
    }

    private static String upper(String s) {
//        return s.toUpperCase(Locale.ROOT);
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z') {
                res += (char) ((int) s.charAt(i) - 32);
            }else{
                res+=s.charAt(i);
            }
        }
        return  res;
    }
}
