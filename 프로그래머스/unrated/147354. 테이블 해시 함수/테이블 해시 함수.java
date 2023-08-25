import java.util.*;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        col--; row_begin--; row_end--;
        final int r= col;
        
        Arrays.sort(data, (a, b)->{
            if(a[r]<b[r])
                return -1;
            else if(a[r]==b[r] && a[0]>b[0])
                return -1;
            return 1;
        });
        
       // printArr(data);
        int n = 0;
        int newS = 0;
        for(int i = row_begin;i<=row_end;i++){
            newS = 0;
            for(int j=0;j<data[0].length;j++){
                newS += data[i][j]%(i+1);
            }
            n = n^newS;
 
        }
        
        answer = n;
        
    
        return answer;
    }
    
    public void printArr(int[][] data){
        System.out.println();
        for(int i =0;i<data.length;i++){
            for(int j =0;j<data[0].length;j++){
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
    }
}