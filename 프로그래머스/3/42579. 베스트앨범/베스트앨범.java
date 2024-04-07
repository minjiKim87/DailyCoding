import java.util.*;

class Info{
    int id;
    int play;
    
    public Info(int id,  int play){
        this.id = id;
        this.play = play;
    }
}

class Solution {
    public int[] solution(String[] genres, int[] plays) {
      
        HashMap<String, PriorityQueue<Info>> genreMap = new HashMap<>();
        HashMap<String, Integer> genrePlayCountMap = new HashMap<>();
        
        for(int i =0;i<genres.length;i++){
            String genre = genres[i];
            int play = plays[i];
            int id = i;
            
            PriorityQueue<Info> pq = genreMap.getOrDefault(genre, 
                                                           new PriorityQueue<>(new Comparator<Info>(){
                                                               @Override
                                                               public int compare(Info a, Info b){
                                                                   if(a.play==b.play) return a.id - b.id;
                                                                   return b.play - a.play;
                                                               }
                                                           }));
            pq.offer(new Info(id, play));
            genreMap.put(genre, pq);
            genrePlayCountMap.put(genre, genrePlayCountMap.getOrDefault(genre, 0)+play);
        }
        
        //가장 많이 재생된 장르 2개 구학
        List<String> sortedGenres = new ArrayList<>(genrePlayCountMap.keySet());
        sortedGenres.sort((a, b) -> genrePlayCountMap.get(b) - genrePlayCountMap.get(a));
        
        List<Integer> resultList = new ArrayList<>();
        for(String genre : sortedGenres){
            PriorityQueue<Info> pq = genreMap.get(genre);
            int count = 0;
            while(!pq.isEmpty() && count<2){
                resultList.add(pq.poll().id);
                count++;
            }
        }
        
        int[] answer = new int[resultList.size()];
        for(int i = 0;i<answer.length;i++){
            answer[i] = resultList.get(i);
        }
        
        return answer;
    }
}