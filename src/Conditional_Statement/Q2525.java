package Conditional_Statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int C = Integer.parseInt(br.readLine());
        // 유효성 검사 굳이 필요없다.
        if (A < 0 || 23 < A || B < 0 || 59 < B || C < 0 || 1000 < C) {
            System.out.println("조건 위배");
            return;
        }
//        int totalMinutes = 60 * A + B + C;
//        int H = (totalMinutes / 60) % 24;  // 나머지 연산으로 0-23 사이로 맞춤
//        int M = totalMinutes % 60;
//
//        System.out.println(H + " " + M);
        int H = (60 * A + B + C) / 60;
        int M = (60 * A + B + C) % 60;
        if (H > 23) {
            System.out.println((H - 24) + " " + M);
        } else {
            System.out.println(H + " " + M);
        }

    }
}
