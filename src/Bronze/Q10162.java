package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int countA = 0;
        int countB = 0;
        int countC = 0;
        if (T % 10 == 0) {
            if (T >= 300) {
                countA += T / 300;
                T = T % 300;
            }if (T >= 60) {
                countB += T / 60;
                T = T % 60;
            }if (T >= 10) {
                countC += T / 10;
            }
            System.out.println((countA + " " + countB + " " + countC));
        } else {
            System.out.println(-1);
        }
    }
}
