import java.util.Scanner;

public class palindromeArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int start=0;
        int end=arr.length-1;
        boolean palindrome=false;
        while(start<end){
            if(arr[start]!=arr[end]){
                System.out.println("NO");
                palindrome=true;
                break;
            }
            start++;
            end--;
        }
        if(!palindrome){
            System.out.println("YES");
        }
        
    }
}
