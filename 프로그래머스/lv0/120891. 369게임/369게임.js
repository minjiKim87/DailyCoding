function solution(order) {
    var answer = 0;
    var temp = String(order);
    temp.split("").map(a=>a%3==0 && a!=0 ? answer++ : 0)
    
    return answer;
}