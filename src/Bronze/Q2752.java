package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S1 = Integer.parseInt(st.nextToken());
        int S2 = Integer.parseInt(st.nextToken());
        int S3 = Integer.parseInt(st.nextToken());

        if (S1 > S2 && S1 > S3) {
            if (S2 > S3) {
                System.out.println(S3 + " " + S2 + " " + S1);
            } else {
                System.out.println(S2 + " " + S3 + " " + S1);
            }
        } else if (S1 < S2 && S1 < S3) {
            if (S2 < S3) {
                System.out.println(S1 + " " + S2 + " " + S3);
            } else {
                System.out.println(S1 + " " + S3 + " " + S2);
            }
        } else {
            if (S2 < S3) {
                System.out.println(S2 + " " + S1 + " " + S3);
            } else {
                System.out.println(S3 + " " + S1 + " " + S2);
            }
        }

    }
}
