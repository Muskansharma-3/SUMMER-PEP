import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int temp, remainder, sum = 0;

        temp = n;

        while (temp != 0)
        {
            remainder = temp % 10;
            sum += Math.pow(remainder, 3);
            temp /= 10;
        }

        if(sum == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");

        sc.close();
    }
}
