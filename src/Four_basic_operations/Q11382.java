package Four_basic_operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        StringTokenizer st = new StringTokenizer(br.readLine());
//        Long a = Long.parseLong(st.nextToken());
//        Long a = Long.parseLong(st.nextToken());
//        Long a = Long.parseLong(st.nextToken());
//        System.out.println(a + b + c);
        String[] str = br.readLine().split(" ");
        Long a = Long.parseLong(str[0]);
        Long b = Long.parseLong(str[1]);
        Long c = Long.parseLong(str[2]);
        System.out.println(a + b + c);


    }
}
