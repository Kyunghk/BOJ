package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2446 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 2 * i - 1; j <= 2 * N - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i <= N; i++) {
            for (int j = i-1; j < N - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < 2*N-1-i; j++) {
//                if (i <= j) {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//                System.out.println();
//            }
//        }
    }
}
