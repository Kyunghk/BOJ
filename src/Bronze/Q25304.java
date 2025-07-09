package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q25304 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int a, b;
        int sum = 0;

        if (1 <= X && X <= 1000000000) {
            if (1 <= N && N <= 100) {
                for (int i = 0; i < N; i++) {
//                    String [] str = br.readLine().split(" ");
//                    a = Integer.parseInt(str[0]);
//                    b = Integer.parseInt(str[1]);

                    StringTokenizer st = new StringTokenizer(br.readLine());
                    a = Integer.parseInt(st.nextToken());
                    b = Integer.parseInt(st.nextToken());

//                    a = Integer.parseInt(br.readLine());
//                    b = Integer.parseInt(br.readLine());

                    sum += a * b;
                }
            } else {
                System.out.println("제한 조건에 위배됩니다.");
                return;
            }
        } else {
            System.out.println("제한 조건에 위배됩니다.");
            return;
        }
        // 마지막 출력 조건
        if (X == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

