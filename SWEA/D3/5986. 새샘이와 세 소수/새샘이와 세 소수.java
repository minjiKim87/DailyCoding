///////
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
 	boolean[] prime = new boolean[1000];
        Arrays.fill(prime, false);
        for(int i=1;i<=999;i++){
         if(isPrime(i))
          prime[i] = true;   
         
        }
	//System.out.println("t"+T);
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
            int answer =0;
            
           // System.out.println(N);
            HashSet<String> set = new HashSet<>();
            
               for(int i=2;i<=N;i++){
                for(int j = i;j<=N ;j++){
      
                  if(prime[i]&&prime[j] && (i+j<N-2)){
                      
                      if(prime[N-i-j]){
                          //System.out.println(i+", "+j+", "+(N-i-j));
                           int[] arr = {i, j, N-i-j};
                          Arrays.sort(arr);
                          set.add(Arrays.toString(arr));
                      }
                         
                  }
                             
                   }
               }
           
            
   
            
           System.out.println("#"+test_case+" "+set.size());
            

		}
	}
    
    public static boolean isPrime(int n){
        if(n==1)
            return false;
        if(n==2)
            return true;
        
     for(int i =2;i*i<=n;i++){
          if(n%i==0)
              return false;
     }
        
        return true;
    }
}