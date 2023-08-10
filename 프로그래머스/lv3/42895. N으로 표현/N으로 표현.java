import java.util.*;

class Solution {
    static int[] d = new int[32001];
    public int solution(int N, int number) {
        int answer = 0;
        HashMap<Integer, Set<Integer>> map = new HashMap<>();
        
        if(N==number)
            return 1;

        for(int i=1;i<9;i++){    
            Set<Integer> set = new HashSet<Integer>();
            
            //기본 반복되는것을 넣는다
            String nStr = String.valueOf(N).repeat(i);
            set.add(Integer.valueOf(nStr));
            map.put(i, set);
            //System.out.println(map);
            
            for(int j=1;j<i;j++){
                //j번 사용 집합과 i-j번 사용집합 간의 사칙연산
                //1일땐 없고, 2일땐 1과 1, 3일땐 1과 2..2와 1.. 이런식
              //System.out.println(j+" "+(i-j));
                  for(int value1 : map.get(j)){
                    for(int value2 : map.get(i-j)){
                        set.add(value1*value2);
                        if(value2!=0)
                            set.add(value1/value2);
                        set.add(value1+value2);
                        set.add(value1-value2);
                    }
                }
                
                if(set.contains(number))
                    return i;
            }
        }
        
        return -1;
    }

}