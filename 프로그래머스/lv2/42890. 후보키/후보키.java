import java.util.*;

class Solution {
    static TreeSet<String> candidateSet = new TreeSet<String>();

    public int solution(String[][] relation) {
        
       // String[][] relation ={{"a", "aa"}, {"aa", "a"}, {"a", "a"}} ;
        int answer = 0;
        int n = relation[0].length;
        boolean[] visited = new boolean[n];
   
        for(int i=0 ;i<=relation[0].length;i++){
            comb(relation, visited,0, n, i);    
        }
        
        //System.out.println(candidateSet);
        
        return candidateSet.size();
    }
    
    public void comb(String[][] relation, boolean[] visited, int start, int n, int r){
        if(r==0){
            isCand(relation, visited, n);
            return;
        }
        
        for(int i = start;i<n;i++){
            visited[i]=true;
            comb(relation, visited, i+1, n, r-1);
            visited[i] = false;
        }        
        
    }
    
    public void isCand(String[][] relation, boolean[] visited, int n){
        String[] tmp = new String[relation.length];
        Arrays.fill(tmp,"");
        String key="";
        
        for(int i=0;i<n;i++){
            if(visited[i]){
                key+=String.valueOf(i);
                for(int k=0;k<relation.length;k++){
                    tmp[k]+=relation[k][i]+ "+";
                }
                
            }
        }
        
      
        Set<String> set = new HashSet<String>();
        for(int i=0;i<relation.length;i++){
            
            set.add(tmp[i]);
        }
        
        
        if(set.size()==tmp.length){   
            boolean isMin = true;
            for(int i=0;i<(1<<key.length());i++){
                String subset="";
                for(int j=0;j<key.length();j++){
                    if((i&(1<<j))>0)
                        subset+=key.charAt(j);
                }
                
                if(!subset.equals("")&&candidateSet.contains(subset)){
                    isMin = false;
                    break;
                }
            }
            
            if(isMin){
                for(int i=0;i<(1<<key.length());i++){
                String subset="";
                for(int j=0;j<key.length();j++){
                    if((i&(1<<j))>0)
                        subset+=key.charAt(j);
                }
                candidateSet.remove(subset);
                }
                
                candidateSet.add(key);
            }
                
        }

    }
   
}