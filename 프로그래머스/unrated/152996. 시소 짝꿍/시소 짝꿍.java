import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public long solution(int[] weights) {
        Arrays.sort(weights);
        Map<Double, Integer> map = new HashMap<>();
        long count = 0;
        for (int w : weights) {
            if (map.containsKey(1.0 * w)) {
                count += map.get(1.0 * w);
            }
            if (map.containsKey((1.0 / 2) * w)) {
                count += map.get((1.0 / 2) * w);
            }
            if (map.containsKey((2.0 / 3) * w)) {
                count += map.get((2.0 / 3) * w);
            }
            if (map.containsKey((3.0 / 4) * w)) {
                count += map.get((3.0 / 4) * w);
            }
            map.put(1.0 * w, map.getOrDefault(1.0 * w, 0) + 1);
        }

        return count;
    }
}