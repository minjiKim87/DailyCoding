function solution(before, after) {
    var cnt =0;
   var b= before.split("").sort().join("");
    var a = after.split("").sort().join("");
    console.log(b);
    console.log(a);
    if(b === a)
        return 1;
    else 
        return 0;
    
 
}