package Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (1 <= N && N <= 100) {
            for (int i = 0; i < N; i++) {
                for (int j = N-1; j >i ; j--) {
                    System.out.print(" ");
                }
                for (int j = i+1; j > 0; j--) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        } else {
            System.out.println("조건 위배");
        }

    }
}
