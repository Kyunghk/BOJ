package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int a = N / 4;
        if (4 <= N && N <= 1000) {
            if (N % 4 == 0) {
                for (int i = 0; i < a; i++) {
                    System.out.print("long ");
                }
            } else {
                System.out.println("조건 위배");
                return;
            }
        } else {
            System.out.println("조건 위배");
            return;
        }
        System.out.print("int");
    }
}



