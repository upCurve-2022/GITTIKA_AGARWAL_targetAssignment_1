package assignment1;

import java.util.Scanner;

public class main20 {
    public static void main(String[] args) {


    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
        System.out.println(n);
    int res=0;
    int pow=1;
    while(n>0){
        int rem=n%10;
        n=n/10;
        res+=rem*pow;
        pow=pow*2;
    }
        System.out.println(res);}

}
