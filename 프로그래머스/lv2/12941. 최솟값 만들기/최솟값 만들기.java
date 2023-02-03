import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        for(int k : A){
            a.add(k);
        }
          for(int k : B){
            b.add(k);
        }
        Collections.sort(a);
        Collections.sort(b);
        
        for(int i =0;i<a.size();i++){
            answer+= a.get(i)*b.get(a.size()-i-1);
        }

        return answer;
    }
}