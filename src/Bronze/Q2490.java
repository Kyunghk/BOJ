package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] map = {'E', 'A', 'B', 'C', 'D'};  // 0~4 인덱스 매핑

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count0 = 0;

            for (int j = 0; j < 4; j++) {
                if (st.nextToken().equals("0")) count0++;
            }

            System.out.println(map[count0]);
        }

//        for (int i = 0; i < 3; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int count0 = 0;
//
//            for (int j = 0; j < 4; j++) {
//                int N = Integer.parseInt(st.nextToken());
//                if (N == 0) {
//                    count0++;
//                }
//            }
//            if (count0 == 0) {
//                System.out.println("E");
//            } else if (count0 == 1) {
//                System.out.println("A");
//            } else if (count0 == 2) {
//                System.out.println("B");
//            } else if (count0 == 3) {
//                System.out.println("C");
//            } else if (count0 == 4) {
//                System.out.println("D");
//            }
//        }
    }
}
