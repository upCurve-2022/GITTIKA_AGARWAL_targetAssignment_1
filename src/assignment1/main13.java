package assignment1;

public class main13 {
    public static void main(String[] args) {
        int n=Integer.MAX_VALUE;
        for (int i=1;Math.pow(i,i)<n;i++){
            System.out.print((int)Math.pow(i,i)+" ");
        }
    }
}
