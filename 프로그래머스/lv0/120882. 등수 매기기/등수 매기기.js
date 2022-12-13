function solution(score) {
    var arr = score.map((a,i)=>(score[i][0]+score[i][1])/2)
   
    
    var ranking = JSON.parse(JSON.stringify(arr));
    ranking = ranking.sort((a,b)=>b-a)
    console.log(arr)
    console.log(ranking)
    
    var answer=[]; 
    for(let i =0;i<arr.length;i++){
        for(let j=0;j<ranking.length;j++){
              console.log(arr[i], ranking[j])
            if(arr[i]==ranking[j]){
                answer[i]=j+1
                break
            }
               
        }
    }
    console.log(answer)
    return answer
}