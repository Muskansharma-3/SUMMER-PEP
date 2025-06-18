// package PEP;

import java.util.Scanner;

public class maxAndMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        // max
        int max=Math.max(A, Math.max(B,C));
        int min=Math.min(A, Math.min(B,C));
        
        System.out.println(min+" "+max);
    }
}
