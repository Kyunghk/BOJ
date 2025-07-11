package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {1, 1, 2, 2, 2, 8};
        int[] input = new int[arr.length];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print((arr[i] - input[i]) + " ");
        }


// 내가 푼 알고리즘
//        int a = 1;
//        int b = 1;
//        int c = 2;
//        int d = 2;
//        int e = 2;
//        int f = 8;
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int x = Integer.parseInt(st.nextToken());
//        int y = Integer.parseInt(st.nextToken());
//        int z = Integer.parseInt(st.nextToken());
//        int w = Integer.parseInt(st.nextToken());
//        int h = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//
//        System.out.println((a-x)+" "+(b-y)+" "+(c-z)+" "+(d-w)+" "+(e-h)+" "+(f-k));
    }
}
