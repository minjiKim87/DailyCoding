function solution(spell, dic) {
    var answer = 0;
    var cnt=0;
    
    for(let i =0;i<dic.length;i++){
        cnt=0
        console.log(dic[i])
     for(let j=0;j<spell.length;j++){
         console.log(spell[j])
        if(dic[i].indexOf(spell[j])>=0){                        
         if(dic[i].indexOf(spell[j])==dic[i].lastIndexOf(spell[j])) 
         console.log(dic[i].indexOf(spell[j]))
         console.log(dic[i].lastIndexOf(spell[j]))
           cnt++
            }
        }
    console.log(cnt)
    if(cnt==spell.length)
        answer++;
    }
    
    if(answer>0)
        return 1;
    else
        return 2;

}