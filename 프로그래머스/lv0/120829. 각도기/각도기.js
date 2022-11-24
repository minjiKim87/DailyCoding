function solution(angle) {
    var answer = 0;
    //자바스크립트 switch case에는 조건문 사용불가
    
    if(0 < angle && angle < 90) {
        return 1
    } else if(angle === 90) {
        return 2
    } else if(90 < angle && angle < 180) {
        return 3
    } else {
        return 4
    }
    
    
    return answer;
}