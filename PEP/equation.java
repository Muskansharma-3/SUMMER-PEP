import java.util.Scanner;
public class equation {
    public static boolean fun(double x, double C){
        return (x*x)+Math.sqrt(x)>=C;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double C=sc.nextDouble();
        double x=1.0;
        System.out.format("%");
        double i=1, j=C;
        while(j-i>0.0000001){
            double mid=(double)(i+j)/(2.0);
            if(fun(mid, C)){
                j=mid;
            }else{
                i=mid;
            }
        }
        System.out.println(j);
    }
}
