package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(br.readLine());

        if (D >= 3600) {
            int quo = D / 3600;
            D %= 3600;
            A += quo;
            if (A >= 24) {
                A %= 24;
            }
        }
        if (D < 3600) {
            int quo = D / 60;
            D %= 60;
            B += quo;
            if (B >= 60) {
                A++;
                if (A >= 24) {
                    A %= 24;
                }
                B %= 60;
            }
            C += D;
            if (C >= 60) {
                B++;
                if (B >= 60) {
                    A++;
                    if (A >= 24) {
                        A %= 24;
                    }
                    B %= 60;
                }
                C %= 60;
            }
        }
        System.out.println(A + " " + B + " " + C);

    }
}
