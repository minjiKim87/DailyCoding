function solution(age) {
    //아스키 a 64 a0b1c2

    const arr = String(age).split("");
    console.log(arr);
    let solution ="";
   
    for(let i =0;i<arr.length;i++){
        solution+=String.fromCharCode(Number(arr[i])+97);
    }
      
    return solution;
 
}