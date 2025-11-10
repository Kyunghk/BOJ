package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5524 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split("");
            for (int j = 0; j < s.length; j++) {
                s[j] = s[j].toLowerCase();
            }
            for (int j = 0; j < s.length; j++) {
                System.out.print(s[j]);
            }
            System.out.println();
        }
    }
}
