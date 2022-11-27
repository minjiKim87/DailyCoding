function solution(my_string, n) {
    var answer = '';
    
    answer = [...my_string].map(repeat(n)).join("");
    
    return answer;
}