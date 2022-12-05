function solution(dots) {
    dots = dots.sort() //앞의 두개, 뒤의 두개 같은 x 좌표 됨 
    console.log(dots)
    var cnt = Math.abs(dots[2][0]-dots[0][0])
    var cnt2 = Math.abs(dots[1][1]-dots[0][1])
    
    return cnt*cnt2
}