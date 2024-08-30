package problem_sloving.week_1;

import java.util.ArrayList;
import java.util.List;

    public class Plus_Minus {

        public static void plusMinus(List<Integer> arr) {
            float p = 0;
            float n = 0;
            float z = 0;
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) == 0) {
                    z++;
                } else {
                    if (arr.get(i) > 0) {
                        p++;
                    } else {
                        n++;
                    }
                }
            }
            p /= arr.size();
            n /= arr.size();
            z /= arr.size();
            System.out.println(p);
            System.out.println(n);
            System.out.println(z);
        }

        public static void main(String[] args) {
            List<Integer> arr = new ArrayList<>();
            arr.add(-4);
            arr.add(3);
            arr.add(-9);
            arr.add(0);
            arr.add(4);
            arr.add(1);

            plusMinus(arr);
        }
    }


    //method 2

//    public static void plusMinus(List<Integer> arr) {
//        int p = 0;
//        int n = 0;
//        int z = 0;
//
//        for (int i = 0; i < arr.size(); i++) {
//            if (arr.get(i) > 0) {
//                p++;
//            } else if (arr.get(i) < 0) {
//                n++;
//            } else {
//                z++;
//            }
//        }
//
//        float arrsize = arr.size();
//
//        float positiveRatio = (float) p / arrsize;
//        float negativeRatio = (float) n / arrsize;
//        float zeroRatio = (float) z / arrsize;
//
//        System.out.printf("%.6f\n", positiveRatio);
//        System.out.printf("%.6f\n", negativeRatio);
//        System.out.printf("%.6f\n", zeroRatio);
