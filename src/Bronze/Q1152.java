package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine().strip();

        if (line.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] words = line.split(" ");
        System.out.println(words.length);
//        String [] s = br.readLine().strip().split(" ");
//        if (s.length == 1 && s[0].equals("")) {
//            System.out.println(0);
//            return;
//        }
//        System.out.println(s.length);
    }
}
