package assignment1;

import java.util.Scanner;

public class main16 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter range:");
        int N=scn.nextInt();
        int i=1;
        int j=1;
        if(N>0){
           while(i<=N){
               if(j%3!=0){
                   System.out.println(i+",");
                   i=i +4*j;
               }
               j++;
           }
        }

    }
}
