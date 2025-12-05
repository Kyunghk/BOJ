package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] N = br.readLine().split("");
        for (int i = 0; i <= N.length / 10; i++) {
            for (int j = 10 * i; j < 10 * i + 10; j++) {
                if (j>=N.length) {
                    break;
                }
                System.out.print(N[j]);
            }
            System.out.println();
        }

        String s = br.readLine();
        for (int i = 0; i < s.length(); i += 10) {
            int end = Math.min(i + 10, s.length());
            System.out.println(s.substring(i, end));
        }
    }
}
