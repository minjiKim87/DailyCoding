function solution(A, B) {
    var arrA=A.split("")

    if(A.split("").sort().join("")!=B.split("").sort().join(""))
        return -1;
  var cnt=0;
    //pop+unshift
     console.log(arrA)
    for(let i =0;i<B.length;i++){
    if(arrA.join("")==B)
        return cnt
       arrA.unshift(arrA.pop())
                cnt++
    

    }
    
    return -1;

    
}