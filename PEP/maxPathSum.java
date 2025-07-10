import java.util.Scanner;

public class maxPathSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int res=find(arr, 0,0,n,m);
        System.out.println(res);
    }
    private static int find(int[][] arr, int i, int j, int n, int m){
        if(i>=n || j>=m) return Integer.MIN_VALUE;
        if(i==n-1 && j==m-1) return arr[i][j];
        int right=find(arr,i,j+1,n,m);
        int down=find(arr, i+1,j,n,m);
        return arr[i][j]+Math.max(right,down);
    }
}
