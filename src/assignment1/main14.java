package assignment1;

import java.util.Scanner;

public class main14 {
    public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
        System.out.println("Enter the limit");
int N=scn.nextInt();
int a=1;
int b=4;
int c=7;
        System.out.print(a+",");
        System.out.print(b+",");
        System.out.print(c+",");

for(int i=0;i<N-3;i++){
    System.out.print(a+b+c+",");
    int temp=c;
    c=a+b+c;
    a=b;
    b=temp;

}





    }
}
