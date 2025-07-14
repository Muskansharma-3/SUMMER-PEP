import java.util.Scanner;

public class stonePaperScissors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.nextLine();
        int rock = 0, scissors = 0, paper = 0;

        for (char c : S.toCharArray()) {
            int prevRock = rock, prevScissors = scissors, prevPaper = paper;

            // Update all based on previous state (not repeating the last move)
            rock = Math.max(prevScissors, prevPaper);
            scissors = Math.max(prevRock, prevPaper);
            paper = Math.max(prevRock, prevScissors);

            if (c == 'R') {
                scissors = 0;
                paper++;
            } else if (c == 'S') {
                paper = 0;
                rock++;
            } else if (c == 'P') {
                rock = 0;
                scissors++;
            }
        }

        int result = Math.max(rock, Math.max(scissors, paper));
        System.out.println(result);
    }
}
