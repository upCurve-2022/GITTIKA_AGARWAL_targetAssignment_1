package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class main29 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int key=scn.nextInt();
        int n=scn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();

        }
        Arrays.sort(a);
        if(binarySearch(a,key)){
            System.out.println("The key is present in the array");

        }else{
            System.out.println("The key is not present in the array");
        }
    }

    private static boolean binarySearch(int[] a, int key) {

       int l=0;
       int h=a.length-1;
       while(l<=h){
           int mid =(l+h)/2;
           if(a[mid]==key){
               return true;
           }else if(a[mid]>key){
               h=mid-1;
           }else{
               l=mid+1;
           }
       }
       return false;
    }
}
