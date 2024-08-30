package problem_sloving.week_6;

import java.util.Arrays;
import java.util.List;

public class Misere_Nim {
    public static void main(String[] args) {

//
//        List<Integer> arr = Arrays.asList(9, 8 ,4 ,4 ,4 ,7);
        List<Integer> arr = Arrays.asList(4 ,1 ,1 ,1, 4, 8, 5 ,10 ,1 ,7 ,7, 4 ,10, 9);
//        List<Integer> arr = Arrays.asList(1,1);


        System.out.println(GAME_FUN(arr));
    }

    private static String GAME_FUN(List<Integer> arr) {



        int n = arr.size();

        if (n == 1) {

            if(arr.get(0)>1){
                return "First";

            }else{
                return "Second";
            }
        }
        int total = arr.get(0);
        int xor = arr.get(0);

        for (int i = 1; i < n; i++) {
            total = total + arr.get(i);
            xor = xor ^ arr.get(i);
        }

        if (total == n) {
            if(total % 2 == 0)
            {
                return "First";

            }else{
                return "Second";
            }
            // return total % 2 == 0 ? "First" : "Second";
        }
        if(xor > 0 ){
            return "First";
        }else{
            return "Second";
        }

    }
}
