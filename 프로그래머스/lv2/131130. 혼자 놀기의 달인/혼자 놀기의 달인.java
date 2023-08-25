import java.util.*;

class Solution {
    public int solution(int[] cards) {
        int answer = 0;
        int[] arr=new int[cards.length];
        for(int i =0;i<cards.length;i++){
            arr[i]=cards[i];
        }
        Arrays.sort(arr);
        int maxNum = arr[cards.length-1];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=1;i<=maxNum;i++){
            map.put(i, 0);
        }
        //System.out.println(map);
        int[] visited = new int[maxNum];
        Arrays.fill(visited, 0);
        int group=1;
        int allVisited=0;
        int j =0;
        
        for(int i =0;i<cards.length;i++){
            if(allVisited==visited.length)
                break;
            
            
            if(visited[i]==0){
                visited[i]=1;
                j = cards[i]-1;
                map.put(cards[i], group);
                //System.out.println("i : "+i+" value : "+cards[i]);
                
                while(true){
                    //System.out.println("j : "+j+" value : "+cards[j]);             
                    if(visited[j]==1)
                        break;
                    map.put(cards[j], group);
                    visited[j]=1;
                    j = cards[j]-1;
                    
                    allVisited++;
               
                }
                group++;                  
            }
                
        }

        // System.out.println(group);
        // System.out.println(map);
        int[] score = new int[group+1];
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            score[entry.getValue()]++;
        }
        
        Arrays.sort(score);
   
        answer = score[group]*score[group-1];
       
        return answer;
    }
}