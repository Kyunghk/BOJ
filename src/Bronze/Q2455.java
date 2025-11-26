package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2455 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int offPeople = Integer.parseInt(st.nextToken());
            int onPeople = Integer.parseInt(st.nextToken());
            count += onPeople - offPeople;
            maxCount = Math.max(maxCount, count);
        }
        System.out.println(maxCount);
    }
}
