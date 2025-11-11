package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] side = new int[st.countTokens()];
            for (int i = 0; i < side.length; i++) {
                side[i] = Integer.parseInt(st.nextToken());
            }
            if (side[0] == 0 && side[1] == 0 && side[2] == 0) {
                break;
            }
            Arrays.sort(side);
            int squareSide1 = (int) Math.pow(side[0], 2);
            int squareSide2 = (int) Math.pow(side[1], 2);
            int squareSide3 = (int) Math.pow(side[2], 2);
            if (squareSide3 == squareSide1 + squareSide2) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
