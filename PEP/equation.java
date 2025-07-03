import java.util.Scanner;
public class equation {
    public static boolean fun(double x, double C){
        return (x*x+Math.sqrt(x))>=C;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double C=sc.nextDouble();
        double i=0.0, j=Math.max(1.0, C);
        while(j-i>1e-7){
            double mid=(i+j)/2.0;
            if(fun(mid, C)){
                j=mid;
            }else{
                i=mid;
            }
        }
        System.out.format("%.15f\n",i);
    }
}
