function solution(emergency) {
    /*var answer = [];
    
    var sorArr = emergency;
    sorArr.sort((a,b)=>b-a);
    //console.log(sorArr);
    //console.log(emergency.indexOf(sorArr[2]));
   //console.log( sorArr.map(element=>emergency.indexOf(element)+1));
    
   for(let i =0;i<sorArr.length;i++){
        answer[i]=emergency.indexOf(sorArr[i]);
    }
    console.log(sorArr);
    console.log(sorArr.indexOf(emergency));
   

    return answer;*/
     let sorted = emergency
     sorted = sorted.slice().sort((a,b)=>b-a);
    return emergency.map(v=>sorted.indexOf(v)+1);
    
}