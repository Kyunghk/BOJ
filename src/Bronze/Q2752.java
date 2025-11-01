package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer[] arr = new Integer[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, Comparator.naturalOrder());
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);


          // 자바 내장 정렬 Arrays.sort() 사용
//        int[] arr = new int[3];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//
//        Arrays.sort(arr);
//
//        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);


          //알고리즘 사용하지 않은 중첩 if 사용
//        int S1 = Integer.parseInt(st.nextToken());
//        int S2 = Integer.parseInt(st.nextToken());
//        int S3 = Integer.parseInt(st.nextToken());
//
//        if (S1 > S2 && S1 > S3) {
//            if (S2 > S3) {
//                System.out.println(S3 + " " + S2 + " " + S1);
//            } else {
//                System.out.println(S2 + " " + S3 + " " + S1);
//            }
//        } else if (S1 < S2 && S1 < S3) {
//            if (S2 < S3) {
//                System.out.println(S1 + " " + S2 + " " + S3);
//            } else {
//                System.out.println(S1 + " " + S3 + " " + S2);
//            }
//        } else {
//            if (S2 < S3) {
//                System.out.println(S2 + " " + S1 + " " + S3);
//            } else {
//                System.out.println(S3 + " " + S1 + " " + S2);
//            }
//        }

    }
}
