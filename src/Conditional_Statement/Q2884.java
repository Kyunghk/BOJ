package Conditional_Statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int H = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        if (45 <= M && M <= 59) {
            if (0 <= H && H <= 23) {
                System.out.print(H + " ");
                System.out.print(M - 45);
            }
        }
        if (0 <= M && M <= 44) {
            if (1 <= H && H <= 23) {
                System.out.print(H - 1 + " ");
                System.out.print(M + 15);
            } else if (H == 0) {
                System.out.print(H + 23 + " ");
                System.out.print(M + 15);
            }
        }
//        // 입력 범위 유효성 검사
//        if (H < 0 || H > 23 || M < 0 || M > 59) {
//            System.out.println("잘못된 입력입니다. 시간은 0-23, 분은 0-59 범위로 입력해 주세요.");
//            return;
//        }
//
//        // 알람 시간 조정
//        M -= 45;
//        if (M < 0) {
//            M += 60;
//            H = (H == 0) ? 23 : H - 1;
//        }
//        System.out.println(H + " " + M);
    }
}
