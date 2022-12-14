function solution(dots) {
    var answer = 0;
    var arr=[]

for(let i = 0 ; i < dots.length ; i ++) {
        // i번째를 제외한 그 다음부터 반복
        for(let j = i+1 ; j < dots.length ; j ++) {
            // y좌표의 차이 / x좌표의 차이 = 기울기
          const curLean = (dots[i][1]-dots[j][1]) / (dots[i][0]-dots[j][0])
            if(arr.includes(curLean)) return 1
            arr.push(curLean)
    }
    }
  
    return 0
}

