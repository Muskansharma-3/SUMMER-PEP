// package PEP;

import java.util.Scanner;

public class maxAndMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        // max
        int max=-1;
        int min=-1;
        if(a>b && a>c) {
            max=a;
        } else if(b>a && b>c) {
            max=b;
        } else {
            max=c;
        }
        // min
        if(a<b && a<c) {
            min=a;
        } else if(b<a && b<c) {
            min=b;
        } else {
            min=c;
        }
        System.out.println(max+" "+min);
    }
}
