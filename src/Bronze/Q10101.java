package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        if (N + S + K == 180) {
            if (N == 60 && S == 60 && K == 60) {
                System.out.println("Equilateral");
                return;
            }
            if (N == S || S == K || K == N) {
                System.out.println("Isosceles");
            }else  {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
}
