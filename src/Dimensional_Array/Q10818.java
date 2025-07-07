package Dimensional_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> E = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int Input = Integer.parseInt(st.nextToken());
            E.add(i, Input);
        }
        int Max = E.get(0);
        int Min = E.get(0);
        for (int i = 0; i < N; i++) {
            if (Max < E.get(i)) {
                Max = E.get(i);
            }
            if (Min > E.get(i)) {
                Min = E.get(i);
            }
        }
        System.out.print(Min + " " + Max);
    }

}
