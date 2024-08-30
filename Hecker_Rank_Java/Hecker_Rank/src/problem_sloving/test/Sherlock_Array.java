package problem_sloving.test;

import java.util.Arrays;
import java.util.List;

public class Sherlock_Array {

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(1,2,3,3);

        System.out.println(Sherlock(arr));

    }

    private static String Sherlock(List<Integer> arr) {
        String s = "";
        int r =0;
        int l = 0;
        for(int n: arr){
            r = r + n;
        }

        for(int n:arr){
            r = r-n;
            if(l == r){
               return  "YES";
            }
            l = l + n;

        }

        return "NO";

    }
}
