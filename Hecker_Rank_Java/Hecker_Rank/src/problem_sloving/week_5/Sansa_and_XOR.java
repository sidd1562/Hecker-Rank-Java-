package problem_sloving.week_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sansa_and_XOR {

    public static void main(String[] args) {

        List<Integer> XOR = Arrays.asList(1,2,3);


        System.out.println(XOR_FUN(XOR));



    }

    private static int XOR_FUN(List<Integer> xor) {



        int n = xor.size();

        if (n % 2 == 0) {
            return 0;
        }

        else {
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if(i%2 == 0) {
                    ans = ans ^ xor.get(i);
                }
            }
            return ans;
        }

    }
}



















//        List<Integer> temp = new ArrayList<>();
//
//        for(int i = 0; i<xor.size()-1; i++){
//            int score = xor.get(i) ^ xor.get(i+1);
//            temp.add(score);
//        }
//        int s3 = 0;
//        if(xor.size() > 3){
//            for(int i = 0; i<xor.size()-1; i++){
//                s3 = s3 ^ xor.get(i);
//            }
//            temp.add(s3);
//        }
//        int s4 = 0;
//        if(xor.size() > 3){
//            for(int i = 1; i<xor.size(); i++){
//                s4 = s4 ^ xor.get(i);
//            }
//            temp.add(s4);
//        }
//
//        int last = 0;
//        for(int n : xor){
//           last = last ^ n;
//        }
//        temp.add(last);
//
//        List<Integer> arr = new ArrayList<>();
//        if (xor != null) {
//            for (int i = 0; i < xor.size(); i++) {
//                arr.add(xor.get(i));
//            }
//        } if(temp != null) {
//            for (int i = 0; i < temp.size(); i++) {
//                arr.add(temp.get(i));
//            }
//        }
//        int ans = 0;
//        for(int n : arr){
//            ans= ans ^ n;
//        }