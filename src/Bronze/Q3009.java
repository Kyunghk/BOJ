package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int countX = 0;
        int countY = 0;
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
        }
        if (list.get(0).equals(list.get(2))) {
            countX = list.get(4);
        } else if (list.get(0).equals(list.get(4))) {
            countX = list.get(2);
        } else if (list.get(2).equals(list.get(4))) {
            countX = list.get(0);
        }
        if (list.get(1).equals(list.get(3))) {
            countY = list.get(5);
        } else if (list.get(3).equals(list.get(5))) {
            countY = list.get(1);
        } else if (list.get(1).equals(list.get(5))) {
            countY = list.get(3);
        }
        System.out.println(countX + " " + countY);
    }
}
