package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            if (N % H == 0) {
                System.out.print(H);
//                System.out.print("1번");
                if (N / H < 10) {
                    System.out.print("0" + N / H);
//                    System.out.print("2번");
                } else {
                    System.out.print(N / H);
//                    System.out.print("3번");
                }
            } else {
                System.out.print(N % H);
//                System.out.print("4번");
                if (N / H < 9) {
                    System.out.print("0" + ((N / H) + 1));
//                    System.out.print("5번");
                } else {
                    System.out.print(((N / H) + 1));
//                    System.out.print("6번");
                }
            }
            System.out.println();
        }
    }
}
