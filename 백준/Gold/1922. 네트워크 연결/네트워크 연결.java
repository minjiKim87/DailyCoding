import java.io.*;
import java.util.*;
class Edge implements Comparable<Edge>{
    int src, dest, weight;

    Edge(int src, int dest, int weight){
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge compareEdge){
        return this.weight - compareEdge.weight;
    }
}
public class Main{
    static int find(int[] parent, int x){
        if(parent[x]==x)return x;
        return parent[x] = find(parent, parent[x]);
    }

    static void union(int[] parent, int a, int b){
        a = find(parent, a);
        b = find(parent, b);
        if(a<b) parent[b] = a;
        else parent[a] = b;
    }
  

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       StringBuilder sb = new StringBuilder();
       
       StringTokenizer st = new StringTokenizer(br.readLine());
       int N = Integer.parseInt(st.nextToken());
       st = new StringTokenizer(br.readLine());
       int M = Integer.parseInt(st.nextToken());

       Edge[] edges = new Edge[M];
       int[] parent = new int[N+1];

       for(int i =0;i<M;i++){
        st = new StringTokenizer(br.readLine());
        int src = Integer.parseInt(st.nextToken());
        int dest = Integer.parseInt(st.nextToken());
        int weight = Integer.parseInt(st.nextToken());
        edges[i] = new Edge(src, dest, weight);
       }

       Arrays.sort(edges);

       for(int i =1;i<=N;i++){
        parent[i] = i;
       }

       int result = 0;
       for(Edge edge : edges){
        if(find(parent, edge.src)!=find(parent, edge.dest)){
            union(parent, edge.src, edge.dest);
                result += edge.weight;
            
        }
       }
      
       System.out.println(result);
       br.close();
        
    }
    
    
}

