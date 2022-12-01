function solution(my_string) {
    var answer = [];
    
    answer = my_string.split("").filter(a=>!isNaN(a))
    
    for(let i=0;i<answer.length;i++){
        Number(answer[i]);
    }

    console.log(answer);
    answer.sort((a,b)=>{
        return a-b
    });
    answer= answer.map(a=>parseInt(a));
    return answer;
}