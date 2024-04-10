import java.util.*;

class Solution {
    HashSet<Integer> set;
    boolean[] visited;
    
    public int solution(String numbers) {
        int answer = 0;
        
        set = new HashSet<>();
        visited = new boolean[numbers.length()];
        dfs("", numbers);
        
        
        return set.size();
    }
    
    public void dfs(String str, String numbers){
        
        if(!str.equals("")&&isPrime(Integer.parseInt(str))){
           // System.out.println(str+", "+Integer.parseInt(str));
            set.add(Integer.parseInt(str));
        }
            
        for(int i=0;i<numbers.length();i++){
             
            if(!visited[i]){
                visited[i]=true;
                dfs(str+numbers.charAt(i), numbers);
                visited[i]=false;
            }
        }
        
    }
    
    public boolean isPrime(int n){
        if(n<2)
            return false;
        
        if(n==2)
            return true;
        
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        
        return true;
    }
}