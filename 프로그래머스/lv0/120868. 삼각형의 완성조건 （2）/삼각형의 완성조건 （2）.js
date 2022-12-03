function solution(sides) {
    var cnt=0;
    var leng=0;
    
    sides.sort((a,b)=>{return a-b});
  
    //leng>=sides[1] && leng<sides[0]+sides[1]  
    //leng<sides[1] && sides[1]<leng+sides[0]
    
    leng=sides[1]
    while(leng<sides[0]+sides[1]){
        cnt++;
        leng++;
    }
    
    leng = sides[1];
    while(sides[1]<leng+sides[0]){
        cnt++;
        leng--;
    }
    
    //이등변일 경우가 두번체크

    return cnt-1;
}