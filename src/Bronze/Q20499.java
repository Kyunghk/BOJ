package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q20499 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []  line =  br.readLine().split("/");
        int K = Integer.parseInt(line[0]);
        int D = Integer.parseInt(line[1]);
        int A = Integer.parseInt(line[2]);
        if (K + A < D || D == 0) {
            System.out.println("hasu");
        }else {
            System.out.println("gosu");
        }
    }
}
