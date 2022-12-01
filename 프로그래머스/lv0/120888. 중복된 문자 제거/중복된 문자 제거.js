function solution(my_string) {
    var answer = '';
    
    answer = my_string.split("").filter((a,index) => my_string.indexOf(a)===index).join("");
    
    
    return answer;
}