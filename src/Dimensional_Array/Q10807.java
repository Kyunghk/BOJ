package Dimensional_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> E = new ArrayList<>();

        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int Input = Integer.parseInt(st.nextToken());
            E.add(i, Input);
        }
        int v = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            if (E.get(i) == v) {
                count++;
            }
        }
        System.out.println(count);
    }
}






