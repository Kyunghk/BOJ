package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxScore = 0;
        int winnerIndex = 0;

        for (int i = 1; i <= 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int totalScore = 0;

            for (int j = 0; j < 4; j++) {
                totalScore += Integer.parseInt(st.nextToken());
            }

            if (totalScore > maxScore) {
                maxScore = totalScore;
                winnerIndex = i;
            }
        }

        System.out.println(winnerIndex + " " + maxScore);
    }
}
