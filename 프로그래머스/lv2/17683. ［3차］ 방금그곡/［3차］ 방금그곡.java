import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "";
        String[][] answerArr = new String[musicinfos.length][2];
        for(String[] i : answerArr) Arrays.fill(i,"!");
        m = funcReplace(m);
        //System.out.println(m);
        
        int index=0;
        
        for(int i =0;i<musicinfos.length;i++){
            String[] arr = musicinfos[i].split(",");
            LocalTime startTime = LocalTime.parse(arr[0]);
            LocalTime endTime = LocalTime.parse(arr[1]);           
            long diffMin = ChronoUnit.MINUTES.between(startTime, endTime);
            
            arr[3] = funcReplace(arr[3]);
            int songMin = arr[3].length();
            String song ="";
            //System.out.println(diffMin +" "+songMin);
            for(int j=0;j<(int)diffMin/songMin;j++){
               
                song += arr[3];
                 //System.out.println(song);
            }
            song+=arr[3].substring(0,(int)diffMin%songMin);
            //System.out.println(song);
            
            if(song.contains(m)){
                answerArr[index][0]=arr[2];//곡 제목
                answerArr[index][1]=String.valueOf(diffMin);
                index++;
            }
            
            
        }
        
        int maxMin=0;
        for(int i = 0;i<answerArr.length;i++){
            if(!answerArr[i][0].equals("!")){
                if(maxMin<Integer.valueOf(answerArr[i][1])){
                    maxMin = Integer.valueOf(answerArr[i][1]);
                    answer = answerArr[i][0];
                }
            }
        }
      
        if(maxMin==0)
            answer="(None)";
        
        return answer;
    }
    
    public String funcReplace(String str){
         //C# : M, D#:N, F# : O, G# : R, A# : Q
        str = str.replace("C#", "M");
        str = str.replace("D#", "N");
        str = str.replace("F#", "O");
        str = str.replace("G#", "R");
        str = str.replace("A#", "Q");
        return str;
        
        
    }
}