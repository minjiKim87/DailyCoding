function solution(n, k) {
    var answer = 12000*n + 2000*k-2000*Math.trunc(n/10);
    
    return answer;
}