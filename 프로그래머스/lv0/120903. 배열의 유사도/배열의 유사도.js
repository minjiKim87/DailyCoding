function solution(s1, s2) {
    var answer = s1.filter((a,i) => s2.includes(a)).length
    
    return answer
}