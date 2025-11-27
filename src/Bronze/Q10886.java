package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10886 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            int answer = Integer.parseInt(br.readLine());
            if (answer == 1) {
                count++;
            }
        }
        if (count >= N / 2+1) {
            System.out.println("Junhee is cute!");
        }else {
            System.out.println("Junhee is not cute!");
        }

    }
}
