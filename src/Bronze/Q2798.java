package Bronze;

import java.io.*;
import java.util.*;

public class Q2798 {

    static int N, M;
    static int[] cards;
    static boolean[] used;
    static int[] pick = new int[3];
    static int best = 0;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        cards = new int[N];
        used = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        perm(0);
        System.out.println(best);
    }

    static void perm(int depth) {
        if (depth == 3) {
            int sum = pick[0] + pick[1] + pick[2];
            if (sum <= M) best = Math.max(best, sum);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!used[i]) {
                used[i] = true;
                pick[depth] = cards[i];
                perm(depth + 1);
                used[i] = false;
            }
        }
    }
}
