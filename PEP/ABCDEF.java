import java.util.*;

public class ABCDEF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] s=new int[n];
        for(int i=0;i<n;i++){
            s[i]=sc.nextInt();
        }
        List<Integer> lhs=new ArrayList<>();
        List<Integer> rhs=new ArrayList<>();
        for(int a:s){
            for(int b:s){
                for(int c:s){
                    lhs.add(a*b+c);
                }
            }
        }
        for(int d:s){
            if(d!=0){
                for(int e:s){
                    for(int f:s){
                        rhs.add(d*(f+e));
                    }
                }
            }
        }
        Map<Integer, Integer> map=new HashMap<>();
        for(int val:rhs){
            map.put(val, map.getOrDefault(val,0)+1);
        }
        long total=0;
        for(int val:lhs){
            if(map.containsKey(val)){
                total+=map.get(val);
            }
        }
        System.out.println(total);
    }
}
