import java.util.* ;

class Solution {
    public boolean solution(String[] phone_book) {
        
        Arrays.sort(phone_book);
        
        // 정렬된 목록에서 이웃하는 번호들끼리 접두사 여부 확인
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) {
                return false;
            }
        }
       
        return true;
    }
}