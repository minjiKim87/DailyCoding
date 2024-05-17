import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();  // 개행 문자 제거

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            int[] week = new int[7];
            int totalClassesInWeek = 0;

            // 요일별 수업 여부 입력 및 주당 총 수업 일수 계산
            for (int i = 0; i < 7; i++) {
                week[i] = sc.nextInt();
                totalClassesInWeek += week[i];
            }

            // 최소 일수 초기화 (충분히 큰 값으로 설정)
            int minDays = Integer.MAX_VALUE;

            // 각 요일에서 시작하여 필요한 수업 일수를 충족할 때까지 검사
            for (int startDay = 0; startDay < 7; startDay++) {
                int days = 0;
                int classes = 0;

                // 수업이 시작될 수 있는 날부터 검사
                for (int i = startDay; classes < n; i = (i + 1) % 7) {
                    if (week[i] == 1) {
                        classes++;
                    }
                    days++;
                }

                // 최소 일수 업데이트
                if (days < minDays) {
                    minDays = days;
                }
            }

            // 결과 출력
            System.out.println("#" + test_case + " " + minDays);
        }

        sc.close();
    }
}
