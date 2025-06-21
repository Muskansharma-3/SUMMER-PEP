import java.util.Scanner;

public class nextChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0); // Read a single character

        if (c == 'z') {
            System.out.println('a');
        } else {
            char next = (char)(c + 1);
            System.out.println(next);
        }
    }
}
