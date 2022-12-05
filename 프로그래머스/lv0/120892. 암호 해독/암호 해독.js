function solution(cipher, code) {
 
    const answer=[...cipher].filter((a,i) => (i+1)%code === 0).join("")
    
    return answer;
}