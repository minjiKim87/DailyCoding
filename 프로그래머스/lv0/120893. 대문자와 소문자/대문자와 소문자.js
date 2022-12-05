function solution(my_string) {
    //charCodeAt
    var answer = my_string.split("").map(a=>a.charCodeAt(0)>96 ? a.toUpperCase() : a.toLowerCase()).join("")
    
    return answer;
}