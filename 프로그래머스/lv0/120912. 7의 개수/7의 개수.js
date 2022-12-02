function solution(array) {
    var answer = 0;
    var temp="";
    
    temp+=array.map(a=>String(a)).join("");
    temp.split("").map(a=>a==7 ? answer++ : 0);
    
    
    return answer;
}