package assignment1;

import java.util.Scanner;

public class main10 {
    public static void main(String[] args) {


    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
        System.out.println(n);
    String res="";
    String s=String.valueOf(n);
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1'){
            res+="One";
        }else if(s.charAt(i)=='2'){
            res+="Two";
        }else if(s.charAt(i)=='0'){
            res+="Zero";
        }else if(s.charAt(i)=='3'){
            res+="Three";
        }else if(s.charAt(i)=='4'){
            res+="Four";
        }else if(s.charAt(i)=='5'){
            res+="Five";
        }else if(s.charAt(i)=='6'){
            res+="Six";
        }else if(s.charAt(i)=='7'){
            res+="Seven";
        }else if(s.charAt(i)=='8'){
            res+="Eight";
        }else if(s.charAt(i)=='9'){
            res+="Nine";
        }

        if(i<s.length()-1){
            res+=" ";
        }
    }
        System.out.println(res);

}}
