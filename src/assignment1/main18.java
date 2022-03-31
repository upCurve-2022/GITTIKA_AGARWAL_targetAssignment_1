package assignment1;

import java.util.Scanner;

public class main18 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int res=1;
        for(int i=1;i<=n;i++){
            res=res*i;
        }
        System.out.println("The factorial of "+String.valueOf(n)+" is "+String.valueOf(res));
    }
}
