import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int temp =0;
        //2차원 배열 정렬 
        for(int i =0;i<sizes.length;i++){
            if(sizes[i][0]>sizes[i][1]){
                temp = sizes[i][1];
                sizes[i][1]= sizes[i][0];
                sizes[i][0]=temp;
            }
        }
        
        Arrays.sort(sizes, (a,b)->{
            return b[0]-a[0];
        });
        
        int w = sizes[0][0];
        
        Arrays.sort(sizes, (a,b)->{
            return b[1]-a[1];
        });
        int h = sizes[0][1];
        
        return w*h;
    }
}