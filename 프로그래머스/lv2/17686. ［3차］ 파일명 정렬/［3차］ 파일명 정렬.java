import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        String[][] fileArr = new String[files.length][4];
        
        funcArr(files, fileArr);   
 
        Arrays.sort(fileArr, (a, b)->(a[0].compareTo(b[0])));
         //funcPrint(fileArr);
        Arrays.sort(fileArr, (a, b)-> {
            if(a[0].equals(b[0]))
                return Integer.compare(Integer.valueOf(a[1]), Integer.valueOf(b[1]));
            
            return 0;
        });
        
        //funcPrint(fileArr);
        
        for(int i =0;i<fileArr.length;i++){
            answer[i]=files[Integer.valueOf(fileArr[i][3])];
        }
        
        
        
        return answer;
    }
    public void funcPrint(String[][] fileArr){
        
        for (int i = 0; i < fileArr.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(fileArr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
    public void funcArr(String[] files, String[][]fileArr){
        for (int i = 0; i < files.length; i++) {
            fileArr[i][3] = String.valueOf(i);
            
            for (int j = 0; j < files[i].length(); j++) {
                
                if (Character.isDigit(files[i].charAt(j))) {
                    fileArr[i][0] = files[i].substring(0, j).toLowerCase();
                    
                    int startOfNumber = j;
                    
                    while (j < files[i].length() && Character.isDigit(files[i].charAt(j))) {
                        j++;
                    }
                    fileArr[i][1] = files[i].substring(startOfNumber, j);
                }

                if (j < files[i].length() && files[i].charAt(j) == '.') {
                    fileArr[i][2] = files[i].substring(j);
                    break; 
                }
            }
            
            if (fileArr[i][0].length() + fileArr[i][1].length() == files[i].length()) {
                fileArr[i][2] = "";
            }
        }
    }
}
