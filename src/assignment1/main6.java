package assignment1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class main6 {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        double n = scn.nextDouble();
        int whole = (int) n;
        double fraction = (double) n - (double) whole;
        System.out.println("The number is : "+String.valueOf(n));
        System.out.println("The whole number is:  "+String.valueOf(whole));
        System.out.println("The fraction part is: "+String.valueOf(fraction));
    }

}
