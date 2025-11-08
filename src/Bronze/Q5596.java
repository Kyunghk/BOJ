package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5596 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) ;
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) ;
        int result = Math.max(S, T);
        System.out.println(result);
    }
}
