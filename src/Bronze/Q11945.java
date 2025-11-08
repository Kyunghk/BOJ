package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split("");
            for (int j = (arr.length - 1); j >= 0; j--) {
                System.out.print(arr[j]);
            }
            System.out.println();
        }
    }
}
