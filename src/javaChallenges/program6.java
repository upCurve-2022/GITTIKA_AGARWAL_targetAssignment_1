package javaChallenges;

import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        if (isLeap(year)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
  static boolean isLeap(int year){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return true;
                }else
                    return  false;
            }else{
                return true;
            }
        }
        return false;
   }
}
