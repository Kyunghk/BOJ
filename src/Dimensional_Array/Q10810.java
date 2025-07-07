package Dimensional_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = 0;
        }

        for (int s = 0; s < M; s++) {
            StringTokenizer sn = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(sn.nextToken());
            int j = Integer.parseInt(sn.nextToken());
            int k = Integer.parseInt(sn.nextToken());
            for (int t = i; t <=j; t++) {
                arr[t-1] = k;
            }

        }

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
