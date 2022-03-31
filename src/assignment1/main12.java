package assignment1;

public class main12 {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 1; i <= n; i++) {
            if(i%2!=0){
                System.out.print("-"+String.valueOf(i)+" ");

            }else{
                System.out.print(i+" ");
            }
        }
    }
}