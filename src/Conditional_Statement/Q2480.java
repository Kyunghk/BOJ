package Conditional_Statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        if (a == b && b == c) {
            System.out.println(10000 + a * 1000);
        } else if (a == b || a == c) {
            System.out.println(1000 + a * 100);
        } else if (b == c) {
            System.out.println(1000 + b * 100);
        } else {
            int max = Math.max(a, Math.max(b, c));  // 3개의 주사위 중 최대값을 구해야함 즉 Math.max 를 이용해 비교
            System.out.println(max * 100);
        }
    }
}

