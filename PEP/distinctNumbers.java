import java.util.*;
import java.io.*;

public class distinctNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] input=br.readLine().split(" ");
        long[] a=new long[n];
        for(int i=0;i<n;i++){
            a[i]=Long.parseLong(input[i]);
        }
        Arrays.sort(a);
        int i=1;
        for(int j=1;j<n;j++){
            if(a[j]!=a[j-1]){
                a[i]=a[j];
                i++;
            }
        }
        System.out.println(i);
    }
}
