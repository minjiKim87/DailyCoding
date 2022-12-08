function solution(a, b) {
    var gcd = 1;
    
    for(let i=2; i<=Math.min(a, b); i++){
        if(a % i == 0 && b % i == 0){
            gcd = i;
        }
    }
    var newa= a/gcd
    var newb = b/gcd
    var smallNumber=[]
    
     let idx = 2
    while(newb !== 1) {
        // n의 약수라면 배열에 추가
        if(newb%idx === 0) {
            smallNumber.push(idx)
            newb/=idx
            idx = 2
        } else {
            idx += 1
        }
    }
    console.log(smallNumber)
    answer =1
    smallNumber.map(a=>a!=2 && a!=5 ? answer=2:0)
    
    return answer
}