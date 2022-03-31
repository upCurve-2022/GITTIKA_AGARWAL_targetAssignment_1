package assignment1;

import java.util.Scanner;

public class main17 {
    static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        for(int i=Math.max(2,n);i<=m;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
