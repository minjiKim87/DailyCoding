class Solution {
    boolean solution(String s) {
      int pCnt =0, yCnt = 0;
    String[] arr = s.toLowerCase().split("");
        for(int i=0;i<arr.length;i++){
            if("p".equals(arr[i]))
                pCnt++;
            else if("y".equals(arr[i]))
                yCnt++;
        }
        
    boolean answer = pCnt==yCnt?  true : false;
        return answer;
    }
}