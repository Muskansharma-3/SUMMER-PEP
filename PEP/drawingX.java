import java.util.Scanner;

public class drawingX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i==j && i+j!=N-1){
                    System.out.print("\\");
                } else if(i+j==N-1 && i!=j) {
                    System.out.print("/");
                }else if(i==N/2 && j==N/2){
                    System.out.print("X");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
