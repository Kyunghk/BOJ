package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q10039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> E = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a>=40) {
                E.add(a);
            }else {
                a=40;
                E.add(a);
            }
        }
        int sum =0;
        for (int i = 0; i < 5; i++) {
           sum+=E.get(i);
        }
        System.out.println(sum / 5);
    }
}
