import java.util.* ;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        String forCheck ="";
        int n=0;
        Arrays.sort(phone_book);
       /* for(int i =0;i<phone_book.length;i++){
            System.out.print(phone_book[i]+" ");
        }*/
        
        for(int i =0 ;i<phone_book.length-1;i++){
            for(int j = i+1;j<phone_book.length;j++){
            
                   if(phone_book[i].length()>phone_book[j].length()){
                    break;
                }
                
                forCheck = phone_book[j].substring(0, phone_book[i].length());
              //  System.out.println(phone_book[i] + " "+ forCheck);
                if(phone_book[i].equals(forCheck)){
                //    System.out.println("이거다!");
                   n=1;
                    break;
                } else{
                    break; // 정렬을 했으니까 아닌게 하나라도 나오면 바로 그 뒤의 것들은 안해도됨
                }
            }
         
            if(n==1){
                answer = false;
                break;
            }
        }        
         
        return answer;
    }
}