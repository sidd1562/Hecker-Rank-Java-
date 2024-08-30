package problem_sloving.week_7;

import java.util.Arrays;
import java.util.List;

public class Goodland_Electricity {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(0, 1, 0, 0,0 ,1, 0);
        int k = 2;

        System.out.println(Electriccity(arr,k));
    }

    private static int Electriccity(List<Integer> arr, int k) {
        int next = -1;
        int count  = 0;
        int pre = -1;
        while (next<arr.size()-1){
            int size = arr.size()-1;
            int next_k = next+k;
            int value = Math.min(next_k,size);
            while (value>pre){
                if(arr.get(value)==1){
                    break;
                }
                value--;
            }

            if(value == pre){
                return -1;

            }

            count++;
            pre = value;
            next = value +k-1;
        }




      return count;
    }
}
