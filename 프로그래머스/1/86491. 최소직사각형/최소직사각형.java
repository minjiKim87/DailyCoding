import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0; // 최대 가로 길이
        int maxHeight = 0; // 최대 세로 길이

        for (int[] size : sizes) {
            int width = Math.max(size[0], size[1]); // 더 긴 쪽을 가로로
            int height = Math.min(size[0], size[1]);  

            maxWidth = Math.max(maxWidth, width);  
            maxHeight = Math.max(maxHeight, height);  
        }

        return maxWidth * maxHeight;  
    }
}
