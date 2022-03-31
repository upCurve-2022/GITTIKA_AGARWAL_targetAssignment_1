package javaChallenges;

import java.util.Scanner;

public class program13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        System.out.println("The number of words in given string is "+wordCount(s1));
    }

    private static int wordCount(String s1) {
        String[] a=s1.split(" ");
        return a.length;
    }
}
