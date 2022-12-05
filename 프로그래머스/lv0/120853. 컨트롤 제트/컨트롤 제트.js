function solution(s) {
    var zIndex=0;
    var start = 0;
    var arr=[]
    var arr2=[]
    arr = s.split(" ")
    console.log(arr)
    
    for(let i=0;i<arr.length;i++){
        if(arr[i]=='Z'){
            arr2.pop()
        }else{
            arr2.push(Number(arr[i]))
        }
    }
    var answer = arr2.reduce(function add(a,b){return a+b;},0)
    return answer
}