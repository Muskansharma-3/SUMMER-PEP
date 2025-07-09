import java.util.Scanner;

public class noOfWays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        System.out.println(count(s,e));
    }
    private static int count(int s,int e){
        if(s==e) return 1;
        if(s>e) return 0;
        return count(s+1, e)+count(s+2,e)+count(s+3,e);
    }
}
