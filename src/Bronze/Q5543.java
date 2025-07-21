package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> burgers = new ArrayList<>();
        ArrayList<Integer> drinks = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            burgers.add(Integer.parseInt(br.readLine()));
        }

        for (int i = 0; i < 2; i++) {
            drinks.add(Integer.parseInt(br.readLine()));
        }

        int minBurger = Collections.min(burgers);
        int minDrink = Collections.min(drinks);

        System.out.println(minBurger + minDrink - 50);
    }
}


//public class Q5543 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int minBurger = Integer.MAX_VALUE;
//        int minDrink = Integer.MAX_VALUE;
//
//        // 햄버거 3개
//        for (int i = 0; i < 3; i++) {
//            int price = Integer.parseInt(br.readLine());
//            minBurger = Math.min(minBurger, price);
//        }
//
//        // 음료 2개
//        for (int i = 0; i < 2; i++) {
//            int price = Integer.parseInt(br.readLine());
//            minDrink = Math.min(minDrink, price);
//        }
//
//        System.out.println(minBurger + minDrink - 50);
//    }
//}