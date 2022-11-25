function solution(array) {
    //sort, median, compareFunction
    
    //const asc_array = array.sort((a,b)=>a-b);
    const asc_array = array.sort(function(a,b){
     if(a>b)return 1;
     if(a===b)return 0;
     if(a<b)return -1;       
    });
    
    return asc_array[Math.floor(array.length/2)];
    
}

/*
// 다른 사람의 풀이 1
function solution(array) {
  return array.sort((a, b) => a - b)[Math.floor(array.length / 2)];
}

// 다른 사람의 풀이 2
const solution = (array) => 
    array
        .sort((a, b) => a - b)
        .at(Math.floor(array.length / 2))
*/