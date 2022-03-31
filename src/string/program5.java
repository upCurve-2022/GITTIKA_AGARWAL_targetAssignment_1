package string;

import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        char arr[]=s.toCharArray();
        int len=0;
        for(char c:arr){
            len++;
        }

        System.out.println(len);
    }
}
