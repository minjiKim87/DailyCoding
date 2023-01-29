class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i =0;i<nums.length-2;i++){
            for(int j =i+1;j<nums.length-1;j++){
                for(int k = j+1;k<nums.length;k++){
                   if(Is_Prime(nums[i]+nums[j]+nums[k])==2)
                       answer++;
                }
            }
        }

        return answer;
    }
    
    
    private static int Is_Prime(int num)
    {
        int count = 0;

        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
                count += 1;
            if(count >= 3)
                return count;
        }
        
        return count;
    }
}