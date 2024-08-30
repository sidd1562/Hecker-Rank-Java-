package problem_sloving.week_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XOR_Strings_3 {

    public static void main(String[] args) {


        List<Integer> arr1 = Arrays.asList(1,1,0,0);
        List<Integer> arr2 = Arrays.asList(1,0,1,0);


        System.out.println(XOR(arr1,arr2));
    }

    private static List<Integer> XOR(List<Integer> arr1, List<Integer> arr2) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i =0; i< arr1.size(); i++)
        {
            if(arr1.get(i) != arr2.get(i) ){
                arrayList.add(1);
            }else{
                arrayList.add(0);
            }
        }
        return arrayList;

    }


}
