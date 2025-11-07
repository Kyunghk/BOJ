package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int count = 0;
            String[] s = br.readLine().split("");
            if (s.length == 1 && s[0].equals("#")) {
                break;
            }
            for (int i = 0; i < s.length; i++) {
                s[i] = s[i].toLowerCase();
                if (s[i].equals("a") || s[i].equals("e") || s[i].equals("i") || s[i].equals("o") || s[i].equals("u")) {
                    count++;
                }

            }
            System.out.println(count);
        }
    }
}
