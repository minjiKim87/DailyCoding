function solution(i, j, k) {
    var answer = 0;
    var l="";
    for(let m = i;m<=j;m++){
        l=l+m;
    }
    
    l.split("").map(a=>a==k? answer++ : 0)
   
    
    
    
    return answer;
}