package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int L =  Integer.parseInt(st.nextToken());
        int P =  Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)-L*P + " ");
        }
    }
}
