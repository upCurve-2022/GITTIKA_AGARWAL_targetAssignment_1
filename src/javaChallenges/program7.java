package javaChallenges;

import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i:a){
            i=scn.nextInt();
            sum+=i;
        }
        System.out.println("The average value of array element is"+sum/n);
    }
}
