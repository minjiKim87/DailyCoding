import java.util.*;

class Node{
    int index;
    int distance;
    
    public Node(int index, int distance){
        this.index = index;
        this.distance = distance;
    }
    
    public int getIndex(){
        return this.index;
    }
    
    public int getDistance(){
        return this.distance;
    }
    
}

class Solution {
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        
        //1. 그래프
        int[][] graph=new int[N][N];
        for(int[] i : graph) Arrays.fill(i, Integer.MAX_VALUE);
        for(int i=0;i<road.length;i++){//마을의 개수N이 아니라 road의 개수로 해야함
            if (graph[road[i][0] - 1][road[i][1] - 1] > road[i][2]) { 
                //마을 연결하는 경로 여러개 있을 수 있음 : 더 짧은걸 배정해줘야함
                graph[road[i][0]-1][road[i][1]-1] = road[i][2]; 
                //양방향 그래프라 반대도 고려해야함
                graph[road[i][1]-1][road[i][0]-1] = road[i][2]; 
            }
        }
        

        
        //2. 다익스트라 호출
        int[] shortestDistances = dijkstra(graph, 0);
        
        //4.K이하인 거리의 개수(답) 구하기
        for(int i =0;i<N;i++){
            //System.out.print(shortestDistances[i]+" ");
           if( shortestDistances[i]<=K)
               answer++;
        }

        return answer;
    }
    
    public static int[] dijkstra(int[][] graph, int start){
        int n = graph.length;
        int[] distances = new int[n];
        boolean[] visited = new boolean[n];
        
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[start]=0;
        
        for(int i=0;i<n-1;i++){
            int nearestNode = findNearestNode(distances, visited);
            visited[nearestNode]=true;
            
            for(int j=0;j<n;j++){
                if(!visited[j] && graph[nearestNode][j]!=Integer.MAX_VALUE&&distances[nearestNode]+graph[nearestNode][j]<distances[j]){
                    distances[j] = distances[nearestNode]+graph[nearestNode][j];
                }
            }
        }
        
        return distances;
        
    }
    
    public static int findNearestNode(int[] distances, boolean[] visited){
        int minDistance = Integer.MAX_VALUE;
        int nearestNode = -1;
        
        for(int i =0;i<distances.length;i++){
            if(!visited[i]&&distances[i]<minDistance){
                minDistance = distances[i];
                nearestNode=i;
            }
        }
        
        return nearestNode;
    }
    
    
    
    
    
    
}