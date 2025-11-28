package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5565 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());
        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());
            money -= n;
        }
        System.out.println(money);
    }
}
