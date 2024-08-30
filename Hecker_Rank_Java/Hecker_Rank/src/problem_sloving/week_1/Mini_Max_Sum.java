package problem_sloving.week_1;

import java.util.*;
class Min_Max_Sum{
    public static void main(String[] args){
        // List<Integer> arr = Arrays.asList(1,2,3,4,5);

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        minimax(arr);
    }

    public static void minimax(List<Integer> arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long sum = 0;

        for(int n : arr){
            if (n < min){
                min = n;

            }
            if(n > max ){
                max  = n;

            }
            sum = sum + n;
        }
        System.out.println((sum - max) + " " + (sum - min));
    }
}
//
//
//   public static int maxMin(int k, List<Integer> arr) {
//
//    Collections.sort(arr);
//    int min = Integer.MAX_VALUE;
//
//    for(int i = 0; i<arr.size() - k; i++){
//        int value =  arr.get(i+k-1) - arr.get(i);
//        if(value < min){
//            min = value;
//        }
//    }
//
//    return min;
//
//}
//
//}
