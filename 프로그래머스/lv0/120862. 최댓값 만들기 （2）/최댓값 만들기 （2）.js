function solution(numbers) {
    var answer = 0;
    
    numbers.sort(function(a,b){
                 return b-a;
                 });
    var first = numbers[0]*numbers[1];
    var second = numbers[numbers.length-1]* numbers[numbers.length-2];
    
    if(first>second)
        return first;
else 
    return second;

}