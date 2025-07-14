package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] s;
        s = br.readLine().split("");
        int count = 0;
        for (int i = 0; i < s.length ; i++) {
            count++;
        }
        System.out.println(count);

    }
}
