package Bronze;

import java.io.*;
import java.util.StringTokenizer;
//import java.util.ArrayList;

public class Q15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
//      ArrayList<Integer> E = new ArrayList<>();
        if (1 <= T && T <= 1000000) {
            for (int i = 0; i < T; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                if (1 <= A && A <= 1000) {
                    if (1 <= B && B <= 1000) {
//                        E.add(i, A + B);
                        bw.write(String.valueOf(A+B));
                        bw.newLine();
                    } else {
                        return;
                    }
                } else {
                    return;
                }

            }
        } else {
            return;
        }
        bw.flush();
        bw.close();
//        for (int i = 0; i < T; i++) {
//            System.out.println(E.get(i));
//        }
    }
}
