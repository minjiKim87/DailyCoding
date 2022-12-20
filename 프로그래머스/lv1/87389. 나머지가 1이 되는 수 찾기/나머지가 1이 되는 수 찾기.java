class Solution {
    public int solution(int n) {
        int answer = 0;
        //n%x==1
        for(int i=1;i<n;i++){
            if(n%i==1)
                return i;
        }
        return answer;
    }
}