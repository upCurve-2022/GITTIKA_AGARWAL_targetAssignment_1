package assignment1;

import java.util.Scanner;

public class main21 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter limit");
        int a=1;
        int b=-1;
        int n=1;
        int limit=scn.nextInt();
        int i=0;
        while(a<=limit){
            System.out.print(a);
            a=Math.abs(a)+(int) Math.pow(n,2);
            if(i%2==0){
                a=-a
;            }
            if(a<=limit){
                System.out.print(",");
            }
i++;
            n++;
        }
    }
}
