package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("");
        int count = 0;
        for (int i = 0; i < s.length / 2; i++) {
            if (s[i].equals(s[s.length - i - 1])) {
                count++;
            }
        }
        if (count == s.length / 2) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }
}
