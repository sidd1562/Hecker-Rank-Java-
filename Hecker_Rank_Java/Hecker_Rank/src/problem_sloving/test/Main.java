package problem_sloving.test;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Main {
    public static void main(String[] args) {


        List<String> arr = Arrays.asList("mmeet", "meet");
        ArrayList<String> temp = new ArrayList<>();
         HashMap<String,Integer> hashMap = new HashMap<>();

          String s = arr.get(0);

        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j < arr.size(); j++) {
              String st = String.valueOf(s.charAt(i));
                if(arr.get(j).contains(st)){
                    if(!hashMap.containsKey(st)){
                        hashMap.put(st,1);
                    }else{
                        hashMap.put(st,hashMap.get(st)+1);
                    }

                }
            }
        }



            System.out.println(hashMap);

    }
}