public class Solution {
    public int solution(int storey) {
        int[] memo = new int[storey + 1];
        return elevator(storey, memo);
    }
    
    public int elevator(int storey, int[] memo) {
        if (storey <= 1) {
            return storey;
        }
        
        if (memo[storey] != 0) {
            return memo[storey];
        }
        
        int divide = storey / 10;
        int left = storey % 10;
        
        int goUp = left + elevator(divide, memo);
        int goDown = (10 - left) + elevator(divide + 1, memo);
        
        memo[storey] = Math.min(goUp, goDown);
        return memo[storey];
    }
}
