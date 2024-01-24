import java.io.*;
import java.util.*;

class Point{
    int x;
    int cnt;

    Point(int x, int cnt){
        this.x = x;
        this.cnt = cnt;
    }
}

public class Main{
    static HashMap<Integer, Integer> ladder;
    static HashMap<Integer, Integer> snake;
    static int minCnt=Integer.MAX_VALUE;
    static Queue<Point> q = new LinkedList<>();
    static boolean[] visited;

    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //BufferedReader br = new BufferedReader(new FileReader("example.txt"));
       
       StringTokenizer st = new StringTokenizer(br.readLine());
       int N = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());

       ladder = new HashMap<>();
       snake = new HashMap<>();
       visited = new boolean[101];

       for(int i =0;i<N;i++){
        st = new StringTokenizer(br.readLine());
        ladder.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
       }

       
       for(int i =0;i<M;i++){
        st = new StringTokenizer(br.readLine());
        snake.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
       }
       
    //    for (Integer key : ladder.keySet()) {
    //     System.out.println(key + ": " + ladder.get(key));
    // }

    q.add(new Point(1, 0));
       System.out.println(bfs());
       
      
       br.close();
        
    }

    public static int bfs(){
        
        while(!q.isEmpty()){
            Point p = q.poll();

            if(p.x==100){
                return p.cnt;
            }

            for(int i =1;i<=6;i++){
                int movedX = p.x+i;

                if(movedX<=100&&!visited[movedX]){
                    visited[movedX]= true;

                    if(ladder.containsKey(movedX)){
                        movedX = ladder.get(movedX);
                    }else if(snake.containsKey(movedX)){
                        movedX = snake.get(movedX);
                    }

                    q.add(new Point(movedX, p.cnt+1));

                    
                }
                
            }
        }

        return -1;


    }
    
    
}

