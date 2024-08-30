package problem_sloving.week_2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Counting_Sort_1 {

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(1,1,2,3,2,1);


        System.out.println(Count(arr));

    }

    private static List<Integer> Count(List<Integer> arr) {
//        Integer[] array = new Integer[100];
//        Arrays.fill(array , 0);
//        for(int i =  0; i<arr.size(); i++){
//            array[arr.get(i)]++;
//        }
//        return Arrays.asList(array);

        ArrayList<Integer> arrayList = new ArrayList<>(Collections.nCopies(100,0));

        for(int i = 0; i<arr.size(); i++){
            int index = arr.get(i);
            arrayList.set(index, arrayList.get(index)+1);
        }

        return arrayList;

    }
}
