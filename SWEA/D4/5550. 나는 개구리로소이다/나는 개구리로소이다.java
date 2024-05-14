import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();  // 개행 문자 제거

        for (int test_case = 1; test_case <= T; test_case++) {
            String str = sc.nextLine();
            if (str.length() % 5 != 0) {
                System.out.println("#" + test_case + " " + -1);
                continue;
            }

            int[] counts = new int[5]; // 'c', 'r', 'o', 'a', 'k'의 개수를 순서대로 저장할 배열
            int frogs = 0, maxFrogs = 0;

            boolean isValid = true;
            for (char ch : str.toCharArray()) {
                switch (ch) {
                    case 'c':
                        counts[0]++;
                        frogs++;
                        if (frogs > maxFrogs) maxFrogs = frogs;
                        break;
                    case 'r':
                        if (counts[0] <= counts[1]) isValid = false;
                        counts[1]++;
                        break;
                    case 'o':
                        if (counts[1] <= counts[2]) isValid = false;
                        counts[2]++;
                        break;
                    case 'a':
                        if (counts[2] <= counts[3]) isValid = false;
                        counts[3]++;
                        break;
                    case 'k':
                        if (counts[3] <= counts[4]) isValid = false;
                        counts[4]++;
                        frogs--;
                        break;
                }
                if (!isValid) break;
            }

            // 모든 'c', 'r', 'o', 'a', 'k'의 개수가 같아야 함
            if (isValid && counts[0] == counts[1] && counts[1] == counts[2] && counts[2] == counts[3] && counts[3] == counts[4]) {
                System.out.println("#" + test_case + " " + maxFrogs);
            } else {
                System.out.println("#" + test_case + " " + -1);
            }
        }

        sc.close();
    }
}
