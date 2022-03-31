package assignment1;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class main7 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<3;i++){
            int m=scn.nextInt();
            System.out.println("The "+String.valueOf(i+1)+" is "+ String.valueOf(m));
            pq.add(m);
        }

        System.out.println("The largest number is "+String.valueOf(pq.poll()));
        System.out.println("The second largest number is "+ String.valueOf(pq.poll()));
    }
}
