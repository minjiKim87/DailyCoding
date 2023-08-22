class Solution {
    public long solution(int k, int d) {
         long count = 0;
        for (int x = 0; x <= d; x += k) {
            long yMaxSquared = (long) d * d - (long) x * x; 
            int yMax = (int) Math.sqrt(yMaxSquared);
            count += (yMax / k) + 1; // +1 to account for y = 0
        }
        return count;
    }
}