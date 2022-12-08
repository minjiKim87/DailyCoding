function solution(quiz) {
    var answer = [];
    var arr= ""
    var oper=0;
    
    for(let i =0;i<quiz.length;i++){
        arr = quiz[i].split(" ")
        
        if(arr[1]=='+')
            oper = Number(arr[0])+Number(arr[2])
        else
            oper = Number(arr[0])-Number(arr[2])
        
        if(oper == Number(arr[4]))
           answer[i]="O"
        else 
            answer[i]="X"
    }
    
    
    return answer;
}