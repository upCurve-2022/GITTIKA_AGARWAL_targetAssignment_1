package assignment1;

import java.util.Scanner;

public class main8 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int even=0;
        int odd=0;
        for(int i=0;i<=n;i=i+2){
            even+=i;
            if(i<n) {
                odd += i + 1;
            }
        }
        System.out.println("Even sum: "+String.valueOf(even));
        System.out.println("Odd sum :"+String.valueOf(odd));
    }
}
