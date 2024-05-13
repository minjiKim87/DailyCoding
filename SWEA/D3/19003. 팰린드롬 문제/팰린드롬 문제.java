import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            sc.nextLine();
            
            ArrayList<String> arr = new ArrayList<>();
            ArrayList<String> reverseArr = new ArrayList<>();
            
            int answer = 0;
            int longestPalindromeLength = 0;  // 가장 긴 팰린드롬의 길이 저장
            
            for (int i = 0; i < N; i++) {
                String str = sc.nextLine();
                StringBuffer sb = new StringBuffer(str);
                String reverse = sb.reverse().toString();
                
                if (str.equals(reverse)) {
                    if (longestPalindromeLength < str.length()) {
                        longestPalindromeLength = str.length();  // 가장 긴 팰린드롬 길이 업데이트
                    }
                } else {
                    arr.add(str);
                    reverseArr.add(reverse);
                }
            }
            
            // 디버깅: 가장 긴 팰린드롬 길이 출력
          //  System.out.println("Longest palindrome length: " + longestPalindromeLength);
            
            Collections.sort(arr);
            Collections.sort(reverseArr);
            
            // 디버깅: 정렬된 리스트 출력
         //   System.out.println("Sorted original list: " + arr);
          //  System.out.println("Sorted reversed list: " + reverseArr);
            
            int i = 0, j = 0;
            
            while (i < arr.size() && j < reverseArr.size()) {
                if (arr.get(i).equals(reverseArr.get(j))) {
                    // 디버깅: 매칭된 팰린드롬 쌍
             //       System.out.println("Matching pair found: " + arr.get(i) + " and " + reverseArr.get(j));
                    answer += arr.get(i).length() ;
                    i++;
                    j++;
                } else if (arr.get(i).compareTo(reverseArr.get(j)) > 0) {
                    j++;
                } else {
                    i++;
                }
            }
            
            answer += longestPalindromeLength;  // 가장 긴 팰린드롬의 길이를 결과에 추가
            System.out.println("#" + test_case + " " + answer);
        }
        sc.close();
    }
}
