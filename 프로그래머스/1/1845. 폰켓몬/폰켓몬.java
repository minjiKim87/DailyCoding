import java.util.*;
import java.util.LinkedList;
import java.util.stream.Collectors;
 

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        /*
        포켓몬 nums.length()만큼 있다
        선택 개수 N/2마리
        같은 종류 = 같은 번호 : [3,1,2,3] -> [1,2,3,3] 정렬?
        최대한 많은 종류의 포켓몬을 선택하는 
        경우의 수X
        그냥 그 방법만 찾아서 종류 몇개인지 리턴
        중복제거?
        */
        
        int get = nums.length;
        LinkedHashSet<Integer> linkedHashSet =
            new LinkedHashSet<>(Arrays.stream(nums) .boxed()
                        .collect(Collectors.toList()));
        if(linkedHashSet.size()>get/2){
            answer = get/2;
        }else{
            answer = linkedHashSet.size();
        }
        
        return answer;
    }
}