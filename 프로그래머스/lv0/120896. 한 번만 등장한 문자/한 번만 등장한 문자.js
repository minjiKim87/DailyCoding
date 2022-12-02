function solution(s) {
    var answer = "";
    
    s.split("").map(a=>s.indexOf(a)==s.lastIndexOf(a) ? answer+=a : 0)

   answer= answer.split("").sort().join("");
    
    return answer;
}