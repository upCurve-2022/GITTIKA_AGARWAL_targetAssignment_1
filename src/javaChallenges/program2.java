package javaChallenges;

import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
//        volume 3.14*r*r*h;
        int r= scn.nextInt();
        int h=scn.nextInt();
        System.out.println("The volume of cylinder is :"+volume(r,h));
    }

    private static double volume(int r, int h) {
        return Math.PI*Math.pow(r,2)*h;
    }
}
