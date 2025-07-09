package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int b = str.charAt(0) - '0';
        int c = str.charAt(1) - '0';
        int d = str.charAt(2) - '0';

        System.out.println(a * d);
        System.out.println(a * c);
        System.out.println(a * b);
        System.out.println(a*(100*b+10*c+d));







    }


}
