package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int count = s.charAt(i) - 'A';
            if (count >= 0 && count <= 2) {
                sum += 3;
            }
            if (count >= 3 && count <= 5) {
                sum += 4;
            }
            if (count >= 6 && count <= 8) {
                sum += 5;
            }
            if (count >= 9 && count <= 11) {
                sum += 6;
            }
            if (count >= 12 && count <= 14) {
                sum += 7;
            }
            if (count >= 15 && count <= 18) {
                sum += 8;
            }
            if (count >= 19 && count <= 21) {
                sum += 9;
            }
            if (count >= 22 && count <= 25) {
                sum += 10;
            }
        }
        System.out.println(sum);
    }
}
