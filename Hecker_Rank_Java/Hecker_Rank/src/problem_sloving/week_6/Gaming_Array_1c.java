package problem_sloving.week_6;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gaming_Array_1c {

    public static void main(String[] args) {


        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(7);
//        arr.add(4);
//        arr.add(6);
//        arr.add(5);
//        arr.add(9);
//



        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(9);
////

        System.out.println(GAMEFUN(arr));


    }

    private static String GAMEFUN(List<Integer> arr) {

        String s = "";

        int count = 0;


        while (!arr.isEmpty()){
            int max = Integer.MIN_VALUE;
            int maxIndex = -1;
            for (int i = 0; i<arr.size(); i++) {
                if (arr.get(i) > max) {
                    max = arr.get(i);
                    maxIndex = i;
                }
            }

            int index = arr.indexOf(max);



            for (int i = arr.size() - 1; i >= index; i--) {
                arr.remove(i);

            }

            count++;
        }



         if(count % 2 == 0){
             s = "ANDY";

         }else{
             s = "BOB";
         }


return  s;


//        return (count % 2 != 0) ? "BOB" : "ANDY";


    }
}
