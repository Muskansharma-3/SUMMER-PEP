import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value : ");
        int count = sc.nextInt();
        int n1 = 0, n2 = 1, n3;
        System.out.print("Fiboonaci series upto the entered value : ");
        System.out.print(n1 + " " +n2);
        for(int i = 2; i < count; i++){
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        sc.close();
    }
}
