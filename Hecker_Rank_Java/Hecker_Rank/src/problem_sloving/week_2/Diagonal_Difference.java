package problem_sloving.week_2;

import java.util.Arrays;
import java.util.List;

public class Diagonal_Difference {

    public static void main(String[] args) {
        List<List<Integer>> arr = Arrays.asList(
//                Arrays.asList(11,2,4),
//                Arrays.asList(4,5,6),
//                Arrays.asList(10,2,-12)

                  Arrays.asList(1,2,3),
                  Arrays.asList(4,5,6),
                  Arrays.asList(9,2,9)
        );

        System.out.println(DFE(arr));
    }

    private static int DFE(List<List<Integer>> arr) {

        int left = 0;
        int right = 0;


        for(int i = 0; i<arr.size(); i++){
            left = left + arr.get(i).get(i);
            right = right + arr.get(i).get(arr.size() - i -1);

        }





        return Math.abs(left-right);
    }


}
