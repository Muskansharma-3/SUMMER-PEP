import java.util.*;

public class largestNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        String[] brr=new String[n];
        for(int i=0;i<n;i++){
            brr[i]=String.valueOf(arr[i]);
        }
        Arrays.sort(brr, new Comparator<String>() {
            public int compare(String a, String b){
                String ans1=a+b;
                String ans2=b+a;
                return ans2.compareTo(ans1);

            }
        });
        if(brr[0].equals("0")){
            return "0";
        }
    }
}