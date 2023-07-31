class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                //System.out.println(prices[i]+", "+prices[j]);
                if(prices[i]<=prices[j]){
                    answer[i]++;
                }else if(prices[i]>prices[j]){
                    answer[i]=j-i;
                    break;
                }
            }
        
        }
        
        
        
        return answer;
    }
}