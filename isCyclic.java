public static boolean isCyclic(ArrayList<ArrayList<Integer>> adj, int n){
        Queue<Pair> q = new LinkedList<>();
        
        boolean[] vis = new boolean[n + 1];
        
        q.add(new Pair(1, -1));
        
        while(!q.isEmpty()){
            int node = q.peek().first;
            int prev = q.peek().second;
            
            q.poll();
            
            for(int el : adj.get(node)){
                if(!vis[el]){
                    vis[el] = true;
                    q.add(new Pair(el, node));
                }
                else{
                    if(node != prev){
                        return true;
                    }
                }
            }
        }
            return false;
            
        
    }
