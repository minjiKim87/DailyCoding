import java.util.Arrays;
class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        //Stream<Int> stream = Arrays.stream(arr);
        double sum = (double)Arrays.stream(arr).sum();
        answer = sum / arr.length;
        
        
        return answer;
    }
}