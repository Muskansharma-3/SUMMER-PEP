import java.util.Scanner;

public class luckyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        boolean found=false;
        for(int i=A;i<=B;i++){
            if(isLucky(i)){
                System.out.print(i+" ");
                found=true;
            }
        }
        if(!found){
            System.out.println("-1");
        }
    }
    static boolean isLucky(int num){
        while(num>0){
            int digit=num%10;
            if(digit!=7 && digit!=4){
                return false;
            }
            num/=10;
        }
        return true;
    }
}
