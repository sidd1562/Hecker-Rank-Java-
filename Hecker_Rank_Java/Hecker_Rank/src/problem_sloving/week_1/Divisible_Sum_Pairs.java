package problem_sloving.week_1;

import java.util.Arrays;
import java.util.List;

public class Divisible_Sum_Pairs {


    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

        int count = 0;
        for(int i = 0; i<ar.size(); i++){
            for(int j = i + 1; j<ar.size(); j++){
                if((ar.get(i) + ar.get(j)) % k == 0  ){
                    count++;
                }
            }
        }
        return count;

    }
    public static void main(String[] args){
        List<Integer> arr = Arrays.asList(1 ,3 ,2, 6 ,1 ,2);
        int n = arr.size();
        int k = 3;

        System.out.println(divisibleSumPairs(n,k,arr));


    }
}
