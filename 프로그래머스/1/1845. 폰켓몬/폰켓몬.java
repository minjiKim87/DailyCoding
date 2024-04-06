import java.util.*;
import java.util.LinkedList;
import java.util.stream.Collectors;
 

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int N = nums.length/2;
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        
        if(map.size()>=N){
            answer = N;
        }else{
            answer = map.size();
        }
        
        return answer;
    }
}