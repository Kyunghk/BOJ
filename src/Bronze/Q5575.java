package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5575 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int go_h = Integer.parseInt(st.nextToken());
            int go_m = Integer.parseInt(st.nextToken());
            int go_s = Integer.parseInt(st.nextToken());
            int leave_h = Integer.parseInt(st.nextToken());
            int leave_m = Integer.parseInt(st.nextToken());
            int leave_s = Integer.parseInt(st.nextToken());
            int total_go_s = go_h*3600 + go_m*60 + go_s;
            int total_leave_s = leave_h*3600 + leave_m*60 + leave_s;
            int working = total_leave_s - total_go_s;
            System.out.println(working/3600 + " " + (working%3600)/60 + " " + ((working%3600)%60));
        }

//        StringBuilder sb = new StringBuilder(); // 👉 출력 모아두기용

        //stringbuilder 사용
//        for (int i = 0; i < 3; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int go_h = Integer.parseInt(st.nextToken());
//            int go_m = Integer.parseInt(st.nextToken());
//            int go_s = Integer.parseInt(st.nextToken());
//            int leave_h = Integer.parseInt(st.nextToken());
//            int leave_m = Integer.parseInt(st.nextToken());
//            int leave_s = Integer.parseInt(st.nextToken());
//
//            int total_go_s = go_h * 3600 + go_m * 60 + go_s;
//            int total_leave_s = leave_h * 3600 + leave_m * 60 + leave_s;
//            int working = total_leave_s - total_go_s;
//
//            int h = working / 3600;
//            int m = (working % 3600) / 60;
//            int s = working % 60;
//
//            sb.append(h).append(" ").append(m).append(" ").append(s).append("\n");
//        }
//
//        System.out.print(sb);


    }
}
