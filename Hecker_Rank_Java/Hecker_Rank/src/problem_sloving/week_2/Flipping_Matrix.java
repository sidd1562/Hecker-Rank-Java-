package problem_sloving.week_2;

import java.util.List;

public class Flipping_Matrix {

    public static int flippingMatrix(List<List<Integer>> matrix) {
        int sum = 0;
        int size = matrix.size();
        int halfSize = size / 2;

        for (int i = 0; i < halfSize; i++) {
            for (int j = 0; j < halfSize; j++) {
                int maxValue = Math.max(
                        Math.max(matrix.get(i).get(j), matrix.get(i).get(size - j - 1)),
                        Math.max(matrix.get(size - i - 1).get(j), matrix.get(size - i - 1).get(size - j - 1))
                );
                sum = sum + maxValue;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        // Example usage
        List<List<Integer>> matrix = List.of(
                // i=0 j=0;
                List.of(112, 42, 83, 119),           //  112,119 = 119
                List.of(56, 125 ,56, 49),            //  62,108  =108   = 119
                List.of(15, 78, 101 ,43),
                List.of(62, 98 ,114 ,108));         // i=0 j=1
        // 42,83 = 83
        // 98,114 = 114;   = 114
        //119+114+56+125 = 414
        // i=1; j-0;
        // 56,48 =56
        // 15,43 =43       =56;

        //i=1 j=1;
        //125,56 = 125;
        //78,101 =101       = 125

        int result = flippingMatrix(matrix);
        System.out.println("The maximum sum of the upper-left quadrant is: " + result);  //result =  414
    }
}

