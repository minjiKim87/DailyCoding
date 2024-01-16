import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedReader br = new BufferedReader(new FileReader("example.txt"));
        int N = Integer.parseInt(br.readLine());

        String[][] arr = new String[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken(); 
            arr[i][1] = st.nextToken(); 
        }

        Arrays.sort(arr, (a, b) -> {
            int age1 = Integer.parseInt(a[0]);
            int age2 = Integer.parseInt(b[0]);
            return age1 - age2; 
        });

        for (String[] a : arr) {
            System.out.println(a[0] + " " + a[1]);
        }

        br.close();
    }
}
