package Dimensional_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// 구글링
public class Q5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[30];
        int[] ary = new int[28];
        int[] temp = new int[2];
        for (int i = 0; i < 30; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            ary[i] = n;
        }
        int k = 0;
        for (int i = 0; i < 30; i++) {
            boolean o = false;
            for (int j = 0; j < 28; j++) {
                if (ary[j] == arr[i]) {
                    o = true;
                    break;
                }
            }
            if (!o) {
                temp[k++] = arr[i];
            }
        }
        if (temp[0] > temp[1]) {
            System.out.println(temp[1]);
            System.out.println(temp[0]);
        } else {
            System.out.println(temp[0]);
            System.out.println(temp[1]);
        }
    }

}

// 구글링 최적화 코드

//public class Baekjoon5597 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] student = new int[31];
//
//        for(int i=1; i<29; i++) {
//            int success = sc.nextInt();
//            student[success] = 1;
//        }
//        for(int i=1; i<student.length; i++) {
//            if(student[i]!=1)
//                System.out.println(i);
//        }
//
//
//        sc.close();
//
//    }
//
//}
