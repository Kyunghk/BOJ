package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int j = 1; j <=N ; j++) {
            for (int i = j; i < N; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i <j ; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
