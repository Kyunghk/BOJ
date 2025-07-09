package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Q10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        bw.write(String.valueOf(A + B));
        bw.newLine();
        if (0 <= A && A < 10) {
            if (0 <= B && B < 10) {
                while (A != 0 && B != 0) {
                    StringTokenizer st2 = new StringTokenizer(br.readLine());
                    A = Integer.parseInt(st2.nextToken());
                    B = Integer.parseInt(st2.nextToken());
                    if (A == 0 && B == 0) {
                        break;
                    }
                    bw.write(String.valueOf(A + B));
                    bw.newLine();
                }
            } else {
                System.out.println("조건 위배");
            }
        } else {
            System.out.println("조건 위배");
        }
        bw.flush();
        bw.close();
    }
}

// gpt 코드 최적화


//package Loop;
//
//        import java.io.*;
//        import java.util.StringTokenizer;
//
//public class Q10952 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        while (true) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int A = Integer.parseInt(st.nextToken());
//            int B = Integer.parseInt(st.nextToken());
//
//            if (A == 0 && B == 0) {
//                break; // 입력이 "0 0"이면 반복 종료
//            }
//
//            bw.write((A + B) + "\n");
//        }
//
//        bw.flush();
//        bw.close();
//    }
//}
