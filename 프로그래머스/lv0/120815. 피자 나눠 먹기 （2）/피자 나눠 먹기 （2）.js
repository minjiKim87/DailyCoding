function solution(n) {
    var answer = 0;
    //최소공배수?
    //answer*6 % n =0
    
    for(let i =1;i<6*n;i++){
        if(i*6%n===0)
            return i;
    }
    
    
    return answer;
}