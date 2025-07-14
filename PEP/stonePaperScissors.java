import java.util.Scanner;

public class stonePaperScissors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.nextLine();
        int r=0, sci=0, p=0;

        for (char c:s.toCharArray()){
            int prevr=r, prevs=sci, prevp=p;
            r=Math.max(prevs, prevp);
            sci=Math.max(prevr,prevp);
            p= Math.max(prevr, prevs);

            if (c=='R'){
                sci=0;
                p++;
            } else if(c=='S'){
                p=0;
                r++;
            } else if(c=='P'){
                r=0;
                sci++;
            }
        }

        int result=Math.max(r,Math.max(sci,p));
        System.out.println(result);
    }
}
