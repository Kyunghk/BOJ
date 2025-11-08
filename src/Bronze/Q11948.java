package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());
        int sci_min = Math.min(A, Math.min(B, Math.min(C, D)));
        int his_max = Math.max(E, F);
        int total = A + B + C + D - sci_min + his_max;
        System.out.println(total);
    }
}
