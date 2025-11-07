package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q17388 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int total = S + K + H;
        int Min = Math.min(S, Math.min(K, H));
        if (total >= 100) {
            System.out.println("OK");
        } else {
            if (Min == S) {
                System.out.println("Soongsil");
            }if (Min == K) {
                System.out.println("Korea");
            }if (Min == H) {
                System.out.println("Hanyang");
            }
        }
    }
}
