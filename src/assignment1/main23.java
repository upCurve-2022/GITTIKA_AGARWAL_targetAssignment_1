package assignment1;

import java.util.Scanner;

public class main23 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a=1;
        int b=-2;
        System.out.print(a+","+b);
        for(int i=0;i<n-2;i++){
            a=a+3;
            b=b-4;
            System.out.print(","+a+","+b);
        }
    }
}
