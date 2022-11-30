function solution(num_list, n) {
    var answer = [[]];
  
    var cnt = 0;
    for(let i =0;i< num_list.length ;){
        const temp=[];
        for(let j =0; j<n ;j++){
            temp.push(num_list[i]);
            i++;
        }
        answer.push(temp);
    }
    answer.shift();
    return answer;
}