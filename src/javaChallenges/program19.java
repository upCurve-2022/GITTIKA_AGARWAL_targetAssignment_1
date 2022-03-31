package javaChallenges;

import java.util.Scanner;

public class program19 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        if(isUgly(n)){
            System.out.println("The given number :"+n +" is a ugly number");
        }else{
            System.out.println("The given number "+n+" is not a ugly number");
        }
    }

    private static boolean isUgly(int n) {
       n=maxDivide(n,2);
       n=maxDivide(n,3);
       n=maxDivide(n,5);
       if(n==1){
           return true;
       }else {
           return false;
       }
    }

    private static int maxDivide(int n, int i) {
        while(n%i==0){
            n/=i;
        }
        return n;
    }
}
