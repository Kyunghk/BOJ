package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5554 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s1 = Integer.parseInt(br.readLine());
        int s2 = Integer.parseInt(br.readLine());
        int s3 = Integer.parseInt(br.readLine());
        int s4 = Integer.parseInt(br.readLine());
        int total = s1 + s2 + s3 + s4;
        System.out.println(total/60);
        System.out.println(total%60);
    }
}
