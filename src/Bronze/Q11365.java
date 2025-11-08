package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] s = br.readLine().split("");
            if(s.length == 3 && s[0].equals("E") && s[1].equals("N") && s[2].equals("D")) {
                break;
            }
            for (int i = (s.length-1); i >= 0; i--) {
                System.out.print(s[i]);
            }
            System.out.println();
        }
//        while (true) {
//            String str = br.readLine();
//            if (str.equals("END")) break;
//            System.out.println(new StringBuilder(str).reverse().toString());
//        }
    }
}
