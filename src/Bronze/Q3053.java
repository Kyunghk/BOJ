package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int R = Integer.parseInt(br.readLine());
        double area = Math.PI * R * R;
        double perimeter = 2 * R * R;
        System.out.printf("%.6f%n",area);
        System.out.printf("%.6f",perimeter);
    }
}
