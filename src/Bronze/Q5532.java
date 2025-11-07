package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int Day1 = A/C;
        if (A % C > 0) {
            Day1++;
        }
        int Day2 = B/D;
        if (B % D > 0) {
            Day2++;
        }
//        int total = 0;
//        if(Day1>Day2){
//            total = L - Day1;
//        }else if(Day2>Day1){
//            total = L - Day2;
//        } else if (Day1 == Day2) {
//            total = L - Day1;
//        }
        int total = L - Math.max(Day1,Day2);
        System.out.println(total);
    }
}
