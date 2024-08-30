package problem_sloving.week_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Permuting_Two_Arrays {
    public static void main(String[] args) {


         List<Integer> arr1 = Arrays.asList(2, 1, 3);
         List<Integer> arr2 = Arrays.asList(7, 8, 9);
         int k = 10;

        System.out.println(Permuting_Two_ArraysFun(k,arr1,arr2));



    }

    private static String Permuting_Two_ArraysFun(int k, List<Integer> arr1, List<Integer> arr2) {
        Collections.sort(arr1);
        Collections.sort(arr2,Collections.reverseOrder());
        String s = "YES";

        for(int i =0; i<arr1.size(); i++){
            if(arr1.get(i) + arr2.get(i) < k){
                s = "NO";
            }
        }
        return s;




    }
}
