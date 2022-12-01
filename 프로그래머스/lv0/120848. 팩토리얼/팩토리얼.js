function solution(n) {
    var answer = 0;
    
    //아 어차피 최대가 10이군..
    
    for(let i=10;i>=1;i--){
        if(fac(i)<=n)
            return i;
    }

}

function fac(num){
    if(num==0)
        return 1;
    else
        return num*fac(num-1);
}