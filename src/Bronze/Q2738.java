package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [] [] A = new int [N] [M];
        int [] [] B = new int [N] [M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print((A[i][j]+B[i][j]) + " ");
            }
            System.out.print("\n");
        }
    }
}

//public class Q2738 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//
//        int[][] result = new int[n][m];
//
//        // 첫 번째 행렬 입력
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
//            for (int j = 0; j < m; j++) {
//                result[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//
//        // 두 번째 행렬 입력 + 바로 덧셈 처리
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
//            for (int j = 0; j < m; j++) {
//                result[i][j] += Integer.parseInt(st.nextToken());
//            }
//        }
//
//        // 출력
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                sb.append(result[i][j]).append(" ");
//            }
//            sb.append("\n");
//        }
//        System.out.print(sb);
//    }
//}
