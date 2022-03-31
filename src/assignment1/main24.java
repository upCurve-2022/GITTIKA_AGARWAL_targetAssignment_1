package assignment1;

import java.util.Scanner;

public class main24 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int X=scn.nextInt();
        int res=1;
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            res=res*X;
        }
        System.out.println(String.valueOf(X)+" to the power "+String.valueOf(n)+ " is "+String.valueOf(res));
    }
}
