function solution(my_string) {
    //length 3이면 1개, 5면 2개, 7이면 3개
    //my_string ="2 + 7 - 5 + 10" 
    var answer=0
    var arr=my_string.split(" ")
    console.log(arr)
    //연산자 부분은 1, 3, 5, 7,...
    answer = Number(arr[0])
    for(let i =1;i<=parseInt(arr.length/2);i++){
        console.log(i)
        
        if(arr[2*i-1]=="+")
         answer = answer+Number(arr[2*i])
        else if(arr[2*i-1]=="-"){
         answer = answer-Number(arr[2*i])
    }
       
    }
    
        return answer
    
}