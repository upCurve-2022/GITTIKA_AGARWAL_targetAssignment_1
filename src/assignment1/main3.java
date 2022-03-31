package assignment1;

import java.util.Scanner;

public class main3 {


        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter principle amount");
            int p = scn.nextInt();
            System.out.println("Enter year");
            int t = scn.nextInt();
            System.out.println("Enter rate of interest");
            int r = scn.nextInt();
            double si = p * r * t / 100;
            System.out.println("The simple interest in :" + String.valueOf(si));
        }

}