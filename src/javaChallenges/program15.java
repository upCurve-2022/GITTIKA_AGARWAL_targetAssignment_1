package javaChallenges;

import java.util.ArrayList;

public class program15 {
    public static void main(String[] args) {
String s="GOD";
        ArrayList<String > list=new ArrayList<>();
        boolean c[]=new boolean[3];
        StringBuffer res=new StringBuffer();

       permutation(s,c,res,list);
        System.out.println(list);
    }

    private static void permutation(String s,boolean[] c,StringBuffer res,ArrayList<String> list) {
        if(res.length()==s.length()){
            list.add(res.toString());
        }

        for(int i=0;i<s.length();i++){
            if(c[i]==false){
                res.append(s.charAt(i));
                c[i]=true;
                permutation(s,c,res,list);

                res.deleteCharAt(res.length()-1);
                c[i]=false;


            }
        }
    }
}
