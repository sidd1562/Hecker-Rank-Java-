package problem_sloving.week_3;

import java.util.Arrays;
import java.util.List;

public class Subarray_Division_2 {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2, 2, 1, 3, 2);

        int m = 2;
        int d = 4;

        System.out.println(Finction(m,d,arr));
    }

    private static int Finction(int m, int d, List<Integer> arr) {

        int count = 0;
        for(int i = 0; i<=arr.size()-m; i++){
            int sum =0;
            for(int j = i; j<i+m; j++){
                sum = sum + arr.get(j);
            }
                    if(sum == d){
                        count++;
                    }
        }
        return count;


    }


}
