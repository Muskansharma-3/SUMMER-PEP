import java.util.Arrays;
import java.util.Scanner;

public class sortNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int[] arr = {A, B, C};
        Arrays.sort(arr);
        for (int num : arr) {
            System.out.println(num);
        }
        System.out.println();
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
