package string;

public class program6 {
    public static void main(String[] args) {
        String s1="JAVA";
        String s2="java";
        String s3="Java";
        if(s1==s2){
            System.out.println("s1 = "+s1+" is equals to s2 ="+s2);
        }else{
            System.out.println("s1 not equals to s1");
        }


        String m1="hello";
        String m2="hello";
        if(m1.compareTo(m2)==0){
            System.out.println("m1 =" +m1+" equals to m2 = "+m2);
        }


        if(s1.equalsIgnoreCase(s2)){
            System.out.println("s1 = "+s1+" is equals to s2 ="+s2+ " if we ignore cases");
        }

        if(m1==m2){
            System.out.println("m1 = "+m1+" is equals to m2 = "+m2);
        }
    }
}
