package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] str = br.readLine().split("");
        for (int i = 0; i < str.length; i++) {
            char c = str[i].charAt(0);
            if (Character.isUpperCase(c)) {
                str[i] = str[i].toLowerCase();
            } else {
                str[i] = str[i].toUpperCase();
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
        }

    }
}
