function solution(n) {
    //약수 개수 구하라*2 
    
    var cnt=0;
    
    for(let i =1;i<=n;i++){
        if(n%i===0)
            cnt++;
    }
    
    return cnt;
}