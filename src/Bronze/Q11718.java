package Bronze;
// 실패했던 EOF 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        for (int i = 0; i < 100; i++) {
//            String str = br.readLine();
//            while (str!=null) {
//                System.out.println(str);
//                break;
//            }
//            if(str.equals(""))
//                break;
//        }
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
    }
}
