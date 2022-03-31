package assignment1;

import java.util.Scanner;

public class main19 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        String res="";
        while(n!=0){
            int rem=n%2;
            n=n/2;
            res=rem+res;
        }
        System.out.println("The value of "+String.valueOf(100)+" in binary is "+String.valueOf(res));
    }
}
