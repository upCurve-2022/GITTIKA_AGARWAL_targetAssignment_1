package string;

import javax.xml.stream.events.Characters;
import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        System.out.println("The resulted string is "+ convert(s));
    }

    private static String convert(String s) {

        String res="";
        for(int i=0;i<s.length();i++){
            if(i!=s.length()-1 && i!=0 && s.charAt(i)=='-'&& Character.isDigit(s.charAt(i-1)) && Character.isDigit(s.charAt(i+1))){
                continue;
            }else{
                res+=s.charAt(i);
            }
        }
        return res;
    }
}
