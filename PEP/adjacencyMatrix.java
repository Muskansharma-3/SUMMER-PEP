import java.util.*;

public class adjacencyMatrix {
    public static void main(String[] args) {
        int V=4;
        int[][] matrix=new int[4][4];
        addEdge(matrix,0,1);
        addEdge(matrix,0,2);
        addEdge(matrix,1,2);
        addEdge(matrix,2,3);
        display(matrix);
    }
    private static void addEdge(int[][] matrix, int i, int j){
        matrix[i][j]=1;
        matrix[j][i]=1;
    }
    private static void display(int[][] matrix){
        for(int[] row:matrix){
            for(int val:row){
                System.out.print(val+" ");
            }
            System.out.println();
        }

    }

}
