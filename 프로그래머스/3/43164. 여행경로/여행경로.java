import java.util.*;

class Solution {
    ArrayList<String> routes; //자료구조 arraylist인걸 헷갈림 ;;
    boolean[] visited;
    
    public String[] solution(String[][] tickets) {
     
        routes = new ArrayList<>();
        visited = new boolean[tickets.length];
        
        Arrays.sort(tickets, (a, b)->a[1].compareTo(b[1])); //[1]빼먹음
        
        dfs("ICN", "ICN", tickets, 0);
        
        Collections.sort(routes);// 정렬하는게 Colelctions.sort인걸 헷갈림
        
        return routes.get(0).split(" ");
    }
    
    public void dfs(String current, String route, String[][] tickets, int count){
        
        if(count==tickets.length){ //이걸 빼먹음 ;;
            routes.add(route);
            return;
        }
        
        for(int i=0;i<tickets.length;i++){
            if(!visited[i]&&tickets[i][0].equals(current)){
                visited[i]=true;
                dfs(tickets[i][1], route+" "+tickets[i][1], tickets, count+1);
                visited[i]=false;
            }
        }
    }
}