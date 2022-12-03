function solution(my_str, n) {
    var answer = [];
    //i*n-1
    //substring이면 -1자리까지라 (0,n), (n,2n)...
    
    var i =0;
    while(1){
        answer[i]=my_str.substring(i*n,(i+1)*n);
        if((i+1)*n>=my_str.length){
             answer[i]=my_str.substring(i*n, my_str.length);
             return answer;
        }
        i++;
    }
   
}