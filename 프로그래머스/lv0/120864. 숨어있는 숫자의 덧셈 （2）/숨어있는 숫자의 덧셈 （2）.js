function solution(my_string) {
    var arr=[];
  var regex =  /[^0-9]/g;
    var num_str=""
   arr = my_string.replace(regex, " ").split(" ");
      
    console.log(arr);
    arr = arr.map((i)=>Number(i));
    answer = arr.reduce((a,b)=>(a+b));
    return answer;
}