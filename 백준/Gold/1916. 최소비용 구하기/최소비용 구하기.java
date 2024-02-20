import java.io.*;
import java.util.*;

public class Main{

    static class Edge implements Comparable<Edge>{
        int end, cost;

        public Edge(int end, int cost){
            this.end = end;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o){
            return this.cost-o.cost;
        }
    }

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      // BufferedReader br = new BufferedReader(new FileReader("example.txt"));
      
       int N = Integer.parseInt(br.readLine());
       int M = Integer.parseInt(br.readLine());

       ArrayList<Edge>[] graph = new ArrayList[N];
       for(int i =0;i<N;i++){
        graph[i] = new ArrayList<>();
       }
       
       int start=0;
       int end=0;
       int cost=0;
       for(int i =0;i<M;i++){
        StringTokenizer st = new StringTokenizer(br.readLine());
        
            start = Integer.parseInt(st.nextToken())-1;
            end = Integer.parseInt(st.nextToken())-1;
            cost = Integer.parseInt(st.nextToken());
            graph[start].add(new Edge(end, cost));
       }

       StringTokenizer st = new StringTokenizer(br.readLine());
       int startCity = Integer.parseInt(st.nextToken()) - 1;
       int endCity = Integer.parseInt(st.nextToken()) - 1;

       int[] dist = new int[N];

       Arrays.fill(dist, Integer.MAX_VALUE);
       dist[startCity] = 0;
       PriorityQueue<Edge> pq = new PriorityQueue<>();
       pq.add(new Edge(startCity, 0));

       while(!pq.isEmpty()){
        Edge current = pq.poll();

        if(dist[current.end]<current.cost){
            continue;
        }

        for(Edge next : graph[current.end]){
            if(dist[next.end]> dist[current.end]+next.cost){
                dist[next.end]=dist[current.end]+next.cost;
                pq.add(new Edge(next.end, dist[next.end]));
            }
        }
       }



       System.out.println(dist[endCity]);

       br.close();
        
    }
    
    
}

