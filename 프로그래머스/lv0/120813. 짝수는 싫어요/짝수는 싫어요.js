function solution(n) {
    var answer = [];
    var k=0;
    
    for(let i=0;i<=n;i++){
        if(i%2!=0){
            answer[k]=i;
            k++;
        }
        
    }
    
    return answer;
}