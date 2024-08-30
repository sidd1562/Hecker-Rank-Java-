package problem_sloving.week_6;

import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.List;

public class Forming_Magic_Square {

    public static void main(String[] args) {

        List<List<Integer>> arr = Arrays.asList(
//                Arrays.asList(4, 9, 2),
//                Arrays.asList(3, 5, 7),
//                Arrays.asList(8, 1, 5)


//                Arrays.asList(4, 8, 2),
//                Arrays.asList(4, 5, 7),
//                Arrays.asList(6, 1, 6)


                Arrays.asList(5, 3, 4),
                Arrays.asList(1, 5, 8),
                Arrays.asList(6, 4, 2)


        );

        System.out.println(MAGIC(arr));
    }

    private static int MAGIC(List<List<Integer>> arr) {

        int[][][] PSN = {
                               {{8, 1, 6}, //0
                                {3, 5, 7},
                                {4, 9, 2}},

                        {{6, 1, 8}, //1
                        {7, 5, 3},
                        {2, 9, 4}},

                        {{4, 9, 2}, //2
                        {3, 5, 7},
                        {8, 1, 6}},

                        {{2, 9, 4}, //3
                        {7, 5, 3},
                        {6, 1, 8}},

                        {{8, 3, 4}, //4
                        {1, 5, 9},
                        {6, 7, 2}},

                       {{4, 3, 8}, //5
                        {9, 5, 1},
                        {2, 7, 6}},

                       {{6, 7, 2}, //6
                        {1, 5, 9},
                        {8, 3, 4}},

                       {{2, 7, 6}, //7
                        {9, 5, 1},
                        {4, 3, 8}},
        };


        int min = Integer.MAX_VALUE;
        for (int s = 0; s < 8; s++) {
            int count = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    count = count + Math.abs(arr.get(i).get(j) - PSN[s][i][j]);
                }
            }
            min = Math.min(min, count);
        }


        return min;

    }
}
