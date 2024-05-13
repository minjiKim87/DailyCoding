import java.util.Scanner;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            int answer = -1;
            
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    int num = arr[i] * arr[j];
                    if (func(num) && num > answer) {
                        answer = num;
                    }
                }
            }
            
            System.out.println("#" + test_case + " " + answer);
        }
        sc.close();
    }

    public static boolean func(int num) {
        String str = String.valueOf(num);
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 != arr[i + 1]) { // Ensure characters are converted to integer before comparing
                return false;
            }
        }

        return true;
    }
}
