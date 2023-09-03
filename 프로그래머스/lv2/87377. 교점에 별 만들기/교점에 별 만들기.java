import java.util.*;

class Solution {
    ArrayList<Long> xList = new ArrayList<>();
    ArrayList<Long> yList = new ArrayList<>();
    
    public String[] solution(int[][] line) {
        
        
        for(int i=0;i<line.length-1;i++){
            for(int j =i+1;j<line.length;j++){
                meet(line, i, j);        
            }
        }
        
        // System.out.println(xList);
        // System.out.println(yList);
        
        long maxX = Collections.max(xList);
        long maxY = Collections.max(yList);
        long minX = Collections.min(xList);
        long minY = Collections.min(yList);
        
        String[][] arr= new String[(int)(maxY-minY+1)][(int)(maxX-minX+1)];
        for(String[] a : arr)
            Arrays.fill(a, ".");
      
        
        for(int i = 0; i < xList.size(); i++) {
           long x = xList.get(i);
           long y = yList.get(i);
            arr[(int)(maxY - y)][(int)(x - minX)] = "*";
        }
        
         String[] answer = new String[(int)(maxY - minY + 1)];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = String.join("", arr[i]);
        }


        return answer;
    }
    
    public void meet(int[][] line, int a, int b){
        
        double A = line[a][0];
        double B = line[a][1];
        double E = line[a][2];
        double C = line[b][0];
        double D = line[b][1];
        double F = line[b][2];
        
        if(A*D-B*C==0)
            return;
        
        double x = (B*F-E*D) / (A*D-B*C);
        double y = (E*C-A*F) / (A*D-B*C);
        
        
        if(x == Math.floor(x) && y == Math.floor(y)){
            xList.add((long)x);
            yList.add((long)y);
        }
    }
}