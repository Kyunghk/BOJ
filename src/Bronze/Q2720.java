package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());

            int Q = K / 25;
            K %= 25;

            int D = K / 10;
            K %= 10;

            int N = K / 5;
            K %= 5;

            int P = K / 1;

            System.out.println(Q + " " + D + " " + N + " " + P);
        }
    }
}
