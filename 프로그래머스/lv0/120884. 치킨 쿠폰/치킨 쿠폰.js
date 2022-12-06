function solution(chicken) {
    var answer = 0;
 
    /*1081마리
    서비스 1081/10 => 1081쿠폰 => 108마리, 1쿠폰
    108/10 => 108쿠폰+1쿠폰 => 10마리, 9쿠폰
    10/10 => 1쿠폰 + 9쿠폰 => 1마리*/
    
    while(chicken>=10){
        answer+=parseInt(chicken/10)
        chicken = parseInt(chicken/10)+chicken%10
       
    }
    
    return answer;
}