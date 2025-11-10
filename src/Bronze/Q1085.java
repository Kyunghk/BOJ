package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        if (w >= 1 && w <= 1000 && h >= 1 && h <= 1000) {
            if (x >= 1 && x <= w - 1 && y >= 1 && y <= h - 1) {
                int minX = Math.min(x, w-x);
                int minY = Math.min(y, h-y);
                int dis =  Math.min(minX, minY);
                System.out.println(dis);
            }
        }
    }
}
