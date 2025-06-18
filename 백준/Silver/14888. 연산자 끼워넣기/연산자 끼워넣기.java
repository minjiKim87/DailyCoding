import java.util.*;

public class Main {
    static int N;
    static int[] numbers;
    static int[] operators = new int[4]; // + - * /
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        numbers = new int[N];
        for (int i = 0; i < N; i++) numbers[i] = sc.nextInt();
        for (int i = 0; i < 4; i++) operators[i] = sc.nextInt(); // + - * /

        dfs(1, numbers[0]); // index, 현재까지 계산값
        System.out.println(max);
        System.out.println(min);
    }

    static void dfs(int index, int value) {
        if (index == N) {
            max = Math.max(max, value);
            min = Math.min(min, value);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                operators[i]--;

                int nextValue = 0;
                switch (i) {
                    case 0: nextValue = value + numbers[index]; break;
                    case 1: nextValue = value - numbers[index]; break;
                    case 2: nextValue = value * numbers[index]; break;
                    case 3:
                        if (value < 0)
                            nextValue = -(-value / numbers[index]);
                        else
                            nextValue = value / numbers[index];
                        break;
                }

                dfs(index + 1, nextValue);
                operators[i]++; // backtrack
            }
        }
    }
}
