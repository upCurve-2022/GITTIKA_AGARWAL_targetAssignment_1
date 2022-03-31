package javaChallenges;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class program16 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        System.out.println("The duplicate characters present in given string are : "
        +duplicate(s));
    }

    private static ArrayList<Character> duplicate(String s) {
ArrayList<Character> list=new ArrayList<>();
        s.toLowerCase(Locale.ROOT);
        int c[]=new int[26];
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                int index = (int) s.charAt(i) - 97;
                c[index]++;
            }
        }
        for(int i=0;i<26;i++){
            if(c[i]>=2){
                char st= (char)(i+'a');

                list.add(st);
            }
        }
        return list;
    }
}
