package assignment1;

import java.util.Scanner;

public class main4b {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        int temp=b;
        System.out.println("a: " +String.valueOf(a));
        System.out.println("b: " +String.valueOf(b));
        System.out.println("c: " +String.valueOf(c));
        b=a;
        a=c;
        c=temp;
        System.out.println("a: " +String.valueOf(a));
        System.out.println("b: " +String.valueOf(b));
        System.out.println("c: " +String.valueOf(c));




    }

}
