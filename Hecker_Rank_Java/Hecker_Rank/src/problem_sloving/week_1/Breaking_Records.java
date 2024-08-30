package problem_sloving.week_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Breaking_Records {
    public static List<Integer> breakingRecords(List<Integer> arr) {


        ArrayList<Integer> r =  new ArrayList<>();
        int scoremin = arr.get(0);
        int scoremax = arr.get(0);
        int count_min = 0;
        int count_max = 0;

        for(int i = 0; i<arr.size(); i++){
            int s = arr.get(i);
            if(s < scoremin){
                scoremin = s;
                count_min++;

            }else if(s > scoremax){
                scoremax = s;
                count_max++;
            }
        }
        r.add(count_max);
        r.add(count_min);

        return r;




    }

    public static void main(String[] args){
        List<Integer> arr = Arrays.asList(10 ,5 ,20, 20, 4 ,5 ,2 ,25, 1);

        System.out.println(breakingRecords(arr));
    }
}
