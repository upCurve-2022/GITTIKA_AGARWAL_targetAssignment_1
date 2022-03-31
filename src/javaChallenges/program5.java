package javaChallenges;

import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        if(isPerfectSquare(n)){
            System.out.println(n+" is a perfect square");
        }else{
            System.out.println(n+" is not a perfect square");
        }
    }

    private static boolean isPerfectSquare(int n) {

        int x=(int)Math.sqrt(n);
        return x*x==n;
    }
}
