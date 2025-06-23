import java.util.Scanner;

public class replaceMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        // Input array
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Find min and max values and their indices
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < N; i++) {
            if (A[i] < A[minIndex]) {
                minIndex = i;
            }
            if (A[i] > A[maxIndex]) {
                maxIndex = i;
            }
        }

        // Swap min and max elements
        int temp = A[minIndex];
        A[minIndex] = A[maxIndex];
        A[maxIndex] = temp;

        // Print the array
        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
