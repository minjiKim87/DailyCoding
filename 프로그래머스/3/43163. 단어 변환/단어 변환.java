import java.util.*;

class Node{
    String str;
    int step;
    
    public Node(String str, int step){
        this.str = str;
        this.step = step;
    }
}

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        Queue<Node> queue = new LinkedList<>();
        boolean[] visited = new boolean[words.length];
      
      
        queue.offer(new Node(begin, 0));
        
        while(!queue.isEmpty()){
            Node n = queue.poll();
            
            if(n.str.equals(target)){
                return n.step;
            }
            
            for(int i=0;i<words.length;i++){
                if(!visited[i]&&isOneDiffer(n.str, words[i])){
                    visited[i]=true;
                    queue.offer(new Node(words[i], n.step+1));
                }
            }
        }
        
        
        
        
        return 0;
    }
    
    public boolean isOneDiffer(String word1, String word2){
        int cnt=0;
        for(int i =0;i<word1.length();i++){
           
                if(word1.charAt(i)!=word2.charAt(i)){
                    cnt++;
                }
            if(cnt>1)
                return false;
           
        }
        
        return true;
        
    }
}