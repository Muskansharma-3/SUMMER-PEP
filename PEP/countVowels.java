import java.util.Scanner;

public class countVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(count(s));
    }
    private static int count(String s){
        if(s.length()==0) return 0;
        char ch=Character.toLowerCase(s.charAt(0));
        int count=(ch=='a' || ch=='e' || ch=='o' || ch=='u' || ch=='i')?1:0;
        return count+count(s.substring(1));
    }
}
