function solution(keyinput, board) {
    var answer = [];
    var where ={
        'left': [-1,0], //이거 되나?
        'right':[1,0],
        'up':[0,1],
        'down':[0,-1]
    };
    
    var arr = keyinput.map(i=>where[i])
    var bounder=[]
    bounder[0]=parseInt(board[0]/2);
    bounder[1]=parseInt(board[1]/2);
    var X=0; var Y=0;
    for(let i =0;i<arr.length;i++){
        X+=arr[i][0];
        if(X>bounder[0])
            X=bounder[0]
        else if(X<-bounder[0])
            X=-bounder[0]
      
        Y+=arr[i][1]
        if(Y>bounder[1])
            Y=bounder[1]
        else if(Y<-bounder[1])
            Y=-bounder[1]
        
        
    }
    
    return [X,Y];

}

