import java.util.Scanner;

public class luckyArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        // Input the array and find the minimum element
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] < min) {
                min = a[i];
            }
        }

        // Count the frequency of the minimum element
        int freq = 0;
        for (int num : a) {
            if (num == min) {
                freq++;
            }
        }

        // Check if the frequency is odd or even
        if (freq % 2 == 1) {
            System.out.println("Lucky");
        } else {
            System.out.println("Unlucky");
        }

    }
}