function solution(numbers, k) {
 
    var temp = 2*k-1;
    if(temp<=numbers.length)
        return temp;
    else
        return parseInt(temp%numbers.length);
 
}