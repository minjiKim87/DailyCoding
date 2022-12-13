function solution(board) {
   
    //var safe=board 같이움직임
    //var safe = Object.assign({},board)
   var safe= JSON.parse(JSON.stringify(board));
 
    var area = [[1, 1], [1,0],[1,-1],[0,1],[0,0],[0,-1],[-1,1],[-1,0],[-1,-1]]
   
    /* 00, 01 / 10,11 / 20,21
   safe[i+1][j+1]=1
           safe[i+1][j]=1
           safe[i+1][j-1]=1
           safe[i][j+1]=1
           safe[i][j]=1
           safe[i][j-1]=1
           safe[i-1][j+1]=1
           safe[i-1][j]=1
           safe[i-1][j-1]=1  
*/
        //한 지점 기준으로 그게 지뢰면
    //주위 : +1, +1 ~ -1, -1 8가지가 지뢰 지역인데
    //이미 위험지역으로 된 경우는 바꾸지 않는다 
    //경계선 바깥일때는 의미가 없다
    var check=0
   for(let i =0;i<board.length;i++){
       for(let j =0;j<board.length;j++){      
           if(board[i][j]){
                for(let m =0;m<9;m++){
             
                        if(i+area[m][0]<board.length && i+area[m][0]>-1
                          &&j+area[m][1]<board.length&&j+area[m][1]>-1)
                            safe[i+area[m][0]][j+area[m][1]]=1
                        
                    
                }
           }
         
       }
   }
    console.log(board)
    console.log(safe)
   let count = 0;
for(let i=0; i < safe.length; i++) {
    for(let j=0; j < safe.length; j++){
          if(safe[i][j] == 0)  
        count++
    }
}


    console.log(count)

       return count
       
       
       
}