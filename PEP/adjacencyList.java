import java.util.ArrayList;
import java.util.List;

public class adjacencyList {
    public static void main(String[] args) {
        int V=4;
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<V;i++){
            list.add(new ArrayList<>());
        }
        addEdge(list,0,1);
        addEdge(list,0,2);
        addEdge(list,1,2);
        addEdge(list,2,3);
        display(list);
    }
    private static void addEdge(List<List<Integer>> list, int i, int j){
        list.get(i).add(j);
        list.get(j).add(i);
    }
    private static void display(List<List<Integer>> list){
        for(int i=0;i<list.size();i++){
            System.out.print(i+": ");
            for(int j:list.get(i)){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
