package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9086 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String [] str = new String[20];
        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            str[2*i] = s.charAt(0)+"";
            str[2*i+1] = s.charAt(s.length()-1)+"";
        }
        for (int i = 0; i < T; i++) {
            System.out.println((str[2*i]+str[2*i+1]));
        }
    }
}
//public class Q9086 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int T = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < T; i++) {
//            String s = br.readLine();
//            char first = s.charAt(0);
//            char last = s.charAt(s.length() - 1);
//            System.out.println("" + first + last);
//        }
//    }
//}