function solution(array, n) {
    var answer = [];
    array.push(n)
    array = array.sort((a,b)=>{
        return a-b
    });
    

   var nIndex = array.indexOf(n)
       console.log(array)
    console.log(nIndex)
    
   
   if(nIndex==array.length-1)
       return array[array.length-2]
    else if(nIndex==0)
       return array[1]
    else{
        if((n-array[nIndex-1])<(array[nIndex+1]-n))
           return array[nIndex-1]
        else if((n-array[nIndex-1])>(array[nIndex+1]-n))
            return array[nIndex+1]
        else if((n-array[nIndex-1])==(array[nIndex+1]-n))
            return array[nIndex-1]
    }

}