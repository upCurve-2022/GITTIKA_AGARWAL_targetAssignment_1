package javaChallenges;

import java.util.Scanner;

public class program18 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        int num3=scn.nextInt();
int res =(num1>num2)? (num1>num3?num1:num3) :(num2>num3?num2:num3);
        System.out.println("Largest among three number is "+res);
    }
}
