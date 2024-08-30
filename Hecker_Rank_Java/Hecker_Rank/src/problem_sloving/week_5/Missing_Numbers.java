package problem_sloving.week_5;

import java.util.*;

public class Missing_Numbers {

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(7,2,5,3,5,3);
        List<Integer> brr = Arrays.asList(7,2,5,4,6,3,5,3);

        System.out.println(fun(arr,brr));

    }

    private static  List<Integer>  fun(List<Integer> arr, List<Integer> brr) {
        Map<Integer, Integer> arrCount = new HashMap<>();
        Map<Integer, Integer> brrCount = new HashMap<>();


        for (int num : arr) {
            arrCount.put(num, arrCount.getOrDefault(num, 0) + 1);
        }


        for (int num : brr) {
            brrCount.put(num, brrCount.getOrDefault(num, 0) + 1);
        }

        List<Integer> missingNumbers = new ArrayList<>();


        for (Map.Entry<Integer, Integer> entry : brrCount.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            int val = arrCount.getOrDefault(num, 0);
            if (count > val) {
                missingNumbers.add(num);
            }
        }


        Collections.sort(missingNumbers);

        return missingNumbers;

    }
}
