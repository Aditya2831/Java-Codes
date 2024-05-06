import java.util.*;

public class Solution{
    static int[] dijikstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S){
        PriorityQueue<Pair> queue=new PriorityQueue<Pair>((x,y)=> x.distance-y.distance);

        int []dist=new int[V];
        for(int i=0;i<V;i++){
            dist[i]=(int)(1e9);
        }

            dist[S]=0;
            queue.add(new Pair(0,S));

            while(!queue.isEmpty()){
                int dis=queue.peek().distance;
                int node=queue.peek().node;
                queue.remove();

                for(int i=0;i<adj.get(node).size();i++){
                    int edgeweight=adj.get(node).get(i).get(1);
                    int adjNode=adj.get(node).get(i).get(0);

                    if(dis+edgeweight<dist[adjNode]){
                        dist[adjNode]=dis+edgeweight;
                        queue.add(new Pair(dist[adjNode],adjNode));
                    }

                }
            }
            return dist;
        
    }
}