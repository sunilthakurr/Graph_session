import java.util.*;
public class public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int m = sc.nextInt();
    
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    
    for(int i = 0; i <= n; i++){
        adj.add(new ArrayList<>());
    }
    
    while(m-- > 0){
        int u = sc.nextInt();
        int v = sc.nextInt();
        
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    ArrayList<Integer> res = bfs(adj, n);
    System.out.println(res.toString());
}
    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj, int n){
        Queue<Integer> q = new LinkedList<>();
        int[] vis = new int[n + 1];
        
        ArrayList<Integer> list = new ArrayList<>();
        
        q.add(1);
        
        while(!q.isEmpty()){
            int node = q.poll();
            
            if(vis[node] == 0){
                vis[node] = 1;
                list.add(node);
                
                for(int i = 0; i < adj.get(node).size(); i++){
                    if(adj.get(node).get(i) == 0){
                        q.add(adj.get(node).get(i));
                    }
                }
            }
        }
        return list;
    }
}

// Time-complexity :- O(N)
// Space complexity :- O(N)
