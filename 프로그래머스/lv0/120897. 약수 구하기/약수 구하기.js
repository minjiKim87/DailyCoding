function solution(n) {
    var answer = [];
    var cnt =0;
    for(let i=0;i<=n;i++){
        if(n%i==0){
             answer[cnt]=i;
             cnt++;
        }
           
       
    }
    
    
    return answer;
}