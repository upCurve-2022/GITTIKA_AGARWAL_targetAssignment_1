package string;

import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {


    Scanner scn=new Scanner(System.in);
    String s=scn.nextLine();
   String c=scn.next();
    String res="";
    for(int i=0;i<s.length();i++){
        if((String.valueOf(Character.toLowerCase(s.charAt(i)))).equals(c)){

        }else{
            res+=s.charAt(i);
        }
    }
        System.out.println(res);
    }
}
