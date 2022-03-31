package javaChallenges;

import java.util.Scanner;

public class program14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();
//        if(s1.contains(s2)){
//            System.out.println("Yes s2 is present in s1");
//        }
//       else{
//            System.out.println("s2 is not present in s1");
//        }
        int j=0;
        int i=0;
       while(i<s1.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            }else{
                i++;
        }
       if(j==s2.length()){
           System.out.println("Yes s2 is present in s1");
           return;
       }

    }
        System.out.println("s2 is  not present in s1");
}}
