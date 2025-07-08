package Dimensional_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int [] temp = new int[10];
        int count = 0;
        int [] ary = new int[42];

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            temp[i] = arr[i] % 42;
        }

        for (int i = 0; i < 42; i++) {
            ary[i] = 0;
            for (int j = 0; j < 10; j++) {
                if (i == temp[j]) {
                    ary[i]++;
                }
            }
        }

        for (int i = 0; i < 42; i++) {
            if (ary[i] != 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
