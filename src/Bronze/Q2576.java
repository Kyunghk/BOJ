package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            int N = Integer.parseInt(br.readLine());
            if (N % 2 == 1) {
                list.add(N);
            }
        }
        if (list.isEmpty()) {
            System.out.println(-1);
            return;
        }
        Collections.sort(list);
        int sum =0;
        for (int i = 0; i < list.size(); i++) {
            sum+= list.get(i);
        }
        System.out.println(sum);
        System.out.println(list.get(0));
    }
}
