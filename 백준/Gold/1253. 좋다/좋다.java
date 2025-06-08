import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int count = 0;

        for(int i=0; i<N; i++){
            int target = arr[i];
            int left = 0;
            int right = N - 1;

            while(left < right){
                if(left == i) {
                    left++;
                    continue;
                }
                if(right == i) {
                    right--;
                    continue;
                }

                int sum = arr[left] + arr[right];

                if(sum == target){
                    count++;
                    break; // 좋은 수 하나 발견하면 종료
                } else if(sum < target){
                    left++;
                } else {
                    right--;
                }
            }
        }

        System.out.println(count);
    }
}
