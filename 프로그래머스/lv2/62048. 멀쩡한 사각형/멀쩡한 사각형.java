class Solution {
    public long solution(int w, int h) {
        long totalArea = (long)w * h;
        long diagonal = w + h - gcd(w, h);
        return totalArea - diagonal;
    }
    
    public static long gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
