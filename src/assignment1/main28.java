package assignment1;

import java.util.Scanner;

public class main28 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int key=scn.nextInt();
        int n=scn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();

        }
        if(search(a,key)){
            System.out.println("The key is present in the array");

        }else{
            System.out.println("The key is not present in the array");
        }
    }

    private static boolean search(int[] a, int key) {

        for(int i=0;i<a.length;i++){
            if(key==a[i]){
                return true;
            }
        }
        return false;
    }
}
