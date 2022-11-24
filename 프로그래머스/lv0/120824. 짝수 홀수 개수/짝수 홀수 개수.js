function solution(num_list) {
    var answer = [0,0]; // []이었을때는 실행되지 않는다. 접근실패?
    
    for(let i = 0;i<num_list.length;i++){
        if(num_list[i] %2 === 0)
            answer[0]++;
    }
    
    answer[1] = num_list.length-answer[0];
    
    return answer;
}