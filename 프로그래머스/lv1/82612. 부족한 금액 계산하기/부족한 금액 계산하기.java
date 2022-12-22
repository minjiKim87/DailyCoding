class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        //1부터 count까지 합 * price 
        long num=0;
        for(long i =1;i<=count;i++){
            num+=i;
        }
        
        answer = num*price-money;
        if(answer<0)
            return 0;

        return answer;
    }
}