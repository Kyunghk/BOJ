package Dimensional_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> E = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            int N = Integer.parseInt(br.readLine());
            E.add(i, N);
        }
        int Max = 0;
        int count = 0;
        for (int i = 0; i < 9; i++) {
            if (Max < E.get(i)) {
                Max = E.get(i);
                count = i+1;
            }
        }
        System.out.println(Max);
        System.out.println(count);
    }
}
