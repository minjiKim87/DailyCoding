class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
       // String[] arr = new  String[m*t];
        String str="";
            
        for(int i=0;i<t*m+p;i++){
            str+=Integer.toString(i, n);
        }
       
        
        for(int i =0;i<t;i++){
            if(answer.length()==t)
                break;
            answer+=str.charAt(i*m + p-1);
            
        }
        
        // System.out.println(str);
        // System.out.println(answer);
        
        return answer.toUpperCase();
    }
}