package assignment1;

import java.util.Scanner;

public class main4a {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=scn.nextInt();
        int b=scn.nextInt();
        System.out.println("The value of a before swap:"+String.valueOf(a));
        System.out.println("The value of b before swap:"+String.valueOf(b));
        b=a^b;
        a=a^b;
        b=a^b;
        System.out.println("The value of a after swap:"+String.valueOf(a));
        System.out.println("The value of b after swap:"+String.valueOf(b));
    }
}
