package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(st.nextToken());
            count++;
            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    count--;
                    break;
                }
            }
            if (number == 1) {
                count--;
            }
        }
        System.out.println(count);
    }
}

public class Q1978 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(st.nextToken());
            if (isPrime(x)) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}

