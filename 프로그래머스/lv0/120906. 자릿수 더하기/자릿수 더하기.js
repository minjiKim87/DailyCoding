function solution(n) {
   //길이만큼 for문 돌리기/split/문자열로 취급하기
    
    var n_str = String(n);
    
    return (n+"").split("").reduce((acc,curr)=>acc+parseInt(curr),0);
    
    
}