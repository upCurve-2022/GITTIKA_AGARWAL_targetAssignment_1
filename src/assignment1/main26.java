package assignment1;

import java.util.Scanner;

public class main26 {
    static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        if(isPalindrome(s)){
            System.out.println("The given string is palindrome");
        }else{
            System.out.println("The given string is not palindrome");
        }
    }
}
