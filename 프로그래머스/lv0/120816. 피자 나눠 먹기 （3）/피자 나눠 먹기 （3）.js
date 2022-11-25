function solution(slice, n) {
    var answer = 0;
    
    //slice*answer가 n보다 커지는 순간의 answer필요
    
    for(let i =0;i<slice*n;i++){
        if(slice*i>=n)
        return i;
    }
    
}