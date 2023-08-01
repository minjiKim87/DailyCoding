import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        String[] skillOrder = skill.split("");
        
         Stack<String> skillStack = new Stack<>();
        
       
        List<String> skillOrderList=Arrays.asList(skillOrder);
        System.out.println(skillOrderList.toString());
        
        int check=0;        
        for(int i =0;i<skill_trees.length;i++){
            for(int s =skillOrder.length-1;s>=0;s--){
            skillStack.push(skillOrder[s]);
            }
            
            check=0;
            String[] sList = skill_trees[i].split("");
           // System.out.println(skill_trees[i]);
            
            for(int j =0;j<sList.length;j++){              
                //System.out.println(sList[j]);
                if(skillStack.size()!=0){
                if(skillStack.peek().equals(sList[j])){
                   skillStack.pop();
                }else if(skillOrderList.contains(sList[j])){
                   // System.out.println("x : "+ sList[j]);
                    check++;
                    break;
                }
                }
            }   
           // System.out.println(check);
            if(check==0)
                answer++;
        }
        
        
        
        
        return answer;
    }
}