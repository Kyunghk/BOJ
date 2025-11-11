package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int test_case = 1; test_case <= 10; test_case++) {
            int N = Integer.parseInt(br.readLine());
            int[] height = new int[N];
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                height[i] = Integer.parseInt(st.nextToken());
            }
            for (int i = 2; i < (N - 2); i++) {
                int right_dis = Math.min(height[i] - height[i + 1], height[i] - height[i + 2]);
                int left_dis = Math.min(height[i] - height[i - 1], height[i] - height[i - 2]);
                if (right_dis > 0 && left_dis > 0) {
                    int total = Math.min(left_dis, right_dis);
                    count += total;
                }
            }
            System.out.println("#" + test_case + " " + count);
        }
    }
}
