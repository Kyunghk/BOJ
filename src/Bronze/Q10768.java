package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10768 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Month = Integer.parseInt(br.readLine());
        int Day = Integer.parseInt(br.readLine());
        if (Month > 2) {
            System.out.println("After");
        }else if (Month == 2) {
            if (Day > 18) {
                System.out.println("After");
            }else if (Day == 18) {
                System.out.println("Special");
            }else {
                System.out.println("Before");
            }
        }else {
            System.out.println("Before");
        }
    }
}
