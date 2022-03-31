package assignment1;

import java.util.Scanner;

public class main22 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a[]=new int[n];
        if(n<=1){
            System.out.println( 1);
            return;
        }
        a[0]=1;
        a[1]=1;

        for(int i=2;i<n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
