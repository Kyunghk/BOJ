package Conditional_Statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14681{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        if (a > 0) {
            if (b > 0) {
                System.out.println("1");
            } else if (b < 0) {
                System.out.println("4");
            }
        }
        if (a < 0) {
            if (b > 0) {
                System.out.println("2");
            } else if (b < 0) {
                System.out.println("3");
            }
        }
    }
}
