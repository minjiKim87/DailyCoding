class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        //originPower = number의 약수 개수
        //originPower > limit이면 power로 대체 
        //power의 합    
        int originPower=0;
        
        for(int i =1;i<=number;i++){
            originPower=0;
             for(int j =1;j*j<=i;j++){
                if (j * j == i) {
                originPower++;
            } else if (i % j == 0) {
                originPower += 2;
            }
            }
        if(originPower>limit)
            originPower=power;    
        
       // System.out.println(originPower);
         answer+=originPower;
        
        }
       
        return answer;
    }
}