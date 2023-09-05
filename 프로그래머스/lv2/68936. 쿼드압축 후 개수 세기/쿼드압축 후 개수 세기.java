class Solution {
    int[] answer = {0,0};
    
    public int[] solution(int[][] arr) {        
        quad(arr,0,0,arr.length);     
        return answer;
    }
    
    public void quad(int[][] arr, int x, int y, int size){ 
        
        int check = field(arr, x, y, size);
        if(check!=-1){
           answer[check]++;
            return;
        }
        
        quad(arr, x, y, size/2);
        quad(arr, x, y+size/2, size/2);
        quad(arr, x+size/2, y, size/2);
        quad(arr, x+size/2, y+size/2, size/2);

        return;
    }
    
    public int field(int[][] array, int x, int y, int size){

        
        int initVal = array[x][y];
           for(int i =x;i<x+size;i++){
            for(int j =y;j<y+size;j++){
                if(array[i][j]!=initVal)
                    return -1;
            }
        }
       
        return initVal;
    }
}