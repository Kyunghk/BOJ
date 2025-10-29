package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        String[] str = s.split("");
        int[] counts = new int[26];
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < 26; j++) {
                if (str[i].charAt(0) == 97+j) {
                    counts[j]++;
                }
            }
        }
//        for (int i = 0; i < str.length; i++) {
//            if (str[i].equals("a")) {
//                counts[0]++;
//            }
//            if (str[i].equals("b")) {
//                counts[1]++;
//            }
//            if (str[i].equals("c")) {
//                counts[2]++;
//            }
//            if (str[i].equals("d")) {
//                counts[3]++;
//            }
//            if (str[i].equals("e")) {
//                counts[4]++;
//            }
//            if (str[i].equals("f")) {
//                counts[5]++;
//            }
//            if (str[i].equals("g")) {
//                counts[6]++;
//            }
//            if (str[i].equals("h")) {
//                counts[7]++;
//            }
//            if (str[i].equals("i")) {
//                counts[8]++;
//            }
//            if (str[i].equals("j")) {
//                counts[9]++;
//            }
//            if (str[i].equals("k")) {
//                counts[10]++;
//            }
//            if (str[i].equals("l")) {
//                counts[11]++;
//            }
//            if (str[i].equals("m")) {
//                counts[12]++;
//            }
//            if (str[i].equals("n")) {
//                counts[13]++;
//            }
//            if (str[i].equals("o")) {
//                counts[14]++;
//            }
//            if (str[i].equals("p")) {
//                counts[15]++;
//            }
//            if (str[i].equals("q")) {
//                counts[16]++;
//            }
//            if (str[i].equals("r")) {
//                counts[17]++;
//            }
//            if (str[i].equals("s")) {
//                counts[18]++;
//            }
//            if (str[i].equals("t")) {
//                counts[19]++;
//            }
//            if (str[i].equals("u")) {
//                counts[20]++;
//            }
//            if (str[i].equals("v")) {
//                counts[21]++;
//            }
//            if (str[i].equals("w")) {
//                counts[22]++;
//            }
//            if (str[i].equals("x")) {
//                counts[23]++;
//            }
//            if (str[i].equals("y")) {
//                counts[24]++;
//            }
//            if (str[i].equals("z")) {
//                counts[25]++;
//            }
//        }
        for (int i = 0; i < counts.length; i++) {
            System.out.print(counts[i] + " ");
        }

    }
}
