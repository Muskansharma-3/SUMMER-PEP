package PEP;
import java.util.*;
public class simpleCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a = sc.nextInt();
        long b= sc.nextInt();
        System.out.println(a +" + " + b + " = " + (a + b));
        System.out.println(a +" * " + b + " = " + (a * b));
        System.out.println(a +" - " + b + " = " + (a - b));
    }
}
