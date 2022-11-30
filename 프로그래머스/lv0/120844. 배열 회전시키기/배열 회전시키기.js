function solution(numbers, direction) {
    var answer = numbers;
    var temp = 0;
    

    //push, pop, unshift, shift
    //right pop - unshift
    //left shift-push
    
    
    if(direction === 'left'){
            answer.push(answer.shift());
        
    }else{

        answer.unshift(answer.pop());
        
        
    }
    
    return answer;
}