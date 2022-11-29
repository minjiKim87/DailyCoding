function solution(rsp) {
    //2를 0이 이김, 0을 5가 이김, 5를 2가 이김
    var temp= rsp;
    var win ={
        '2':'0',
        '0':'5',
        '5':'2'
    };
   console.log(answer);
    
    var answer = temp.split("").map(i=>win[i]).join("");
   
    return answer;
    
}

