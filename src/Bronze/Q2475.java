package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] s;
        s = br.readLine().split(" ");
        int sum =0;
        for (int i = 0; i < s.length; i++) {
            sum += (Integer.parseInt(s[i]))*(Integer.parseInt(s[i]));
        }
//        for (String value : s) {
//            int num = Integer.parseInt(value);
//            sum += num * num;
//        }

        System.out.println(sum%10);
    }
}
//public class Q2475 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int sum = 0;
//
//        while (st.hasMoreTokens()) {
//            int num = Integer.parseInt(st.nextToken());
//            sum += num * num;
//        }
//
//        System.out.println(sum % 10);
//    }
//}