import java.util.*;
import java.io.FileInputStream;



class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String str = sc.next();
            char[] charArr = str.toCharArray();
          	Arrays.sort(charArr);
            
            Stack<Character> originStack = new Stack<>();
            Stack<Character> newStack = new Stack<>();
            
            for(int i =0;i<charArr.length;i++){
             originStack.push(charArr[i]);   
            }
            
            while(!originStack.isEmpty()){
             char tmp = originStack.pop();
                
                if(!newStack.isEmpty()){
                    if(newStack.peek()==tmp){
                     newStack.pop();   
                    }else{
                     newStack.push(tmp);   
                    }
                }else{
                 newStack.push(tmp);   
                }
                
            }
            
            System.out.print("#"+test_case+" ");
            if(newStack.isEmpty()){
                System.out.println("Good");
            }else{
             while(!newStack.isEmpty()){
              System.out.print(newStack.pop());   
             }
                System.out.println();
            }
            

		}
	}
}