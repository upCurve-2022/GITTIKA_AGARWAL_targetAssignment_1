package assignment1;

import java.util.Scanner;

public class main27 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int num=n;
        int res=0;
        while(n!=0){
            int rem=n%10;
            n=n/10;
            res+= (int)Math.pow(rem,3);
        }
        if(num==res){
            System.out.println("The number is armstrong number");
        }else{
            System.out.println("The number is not armstrong");
        }
    }
}
