class Solution{
    public int solution(int n) {
        long mod = 1234567;
        long [] dp = new long[2001];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % mod;
        }

        int answer = (int)dp[n]%1234567;
        return answer;
    }
}