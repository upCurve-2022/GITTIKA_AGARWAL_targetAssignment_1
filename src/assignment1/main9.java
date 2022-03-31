package assignment1;

import java.util.Scanner;

public class main9 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println("The number is"+String.valueOf(n));
        int res=0;
        String r="";
     while(n!=0){
         int rem=n%10;
         n=n/10;
//         res=res*10 +rem;
          r+=String.valueOf(rem);
     }
        System.out.println(r);
            }
}
