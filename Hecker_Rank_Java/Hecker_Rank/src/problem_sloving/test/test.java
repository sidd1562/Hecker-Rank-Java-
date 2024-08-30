package problem_sloving.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test {


    public static void main(String[] args) {
        List<List<String>> arr = new ArrayList<>();

//        arr.add(Arrays.asList("0", "ab"));
//        arr.add(Arrays.asList("6", "cd"));
//        arr.add(Arrays.asList("0", "ef"));
//        arr.add(Arrays.asList("6", "gh"));
//        arr.add(Arrays.asList("4", "ij"));
//        arr.add(Arrays.asList("0", "ab"));
//        arr.add(Arrays.asList("6", "cd"));
//        arr.add(Arrays.asList("0", "ef"));
//        arr.add(Arrays.asList("6", "gh"));
//        arr.add(Arrays.asList("0", "ij"));
//        arr.add(Arrays.asList("4", "that"));
//        arr.add(Arrays.asList("3", "be"));
//        arr.add(Arrays.asList("0", "to"));
//        arr.add(Arrays.asList("1", "be"));
//        arr.add(Arrays.asList("5", "question"));
//        arr.add(Arrays.asList("1", "or"));
//        arr.add(Arrays.asList("2", "not"));
//        arr.add(Arrays.asList("4", "is"));
//        arr.add(Arrays.asList("2", "to"));
//        arr.add(Arrays.asList("4", "the"));



        arr.add(Arrays.asList("1","e"));
        arr.add(Arrays.asList("2","a"));
        arr.add(Arrays.asList("1","b"));
        arr.add(Arrays.asList("3","a"));
        arr.add(Arrays.asList("4","f"));
        arr.add(Arrays.asList("1","f"));
        arr.add(Arrays.asList("2","a"));
        arr.add(Arrays.asList("1","e"));
        arr.add(Arrays.asList("1","b"));
        arr.add(Arrays.asList("1","c"));


        test s = new test();
        s.Count(arr);


    }

    private void Count(List<List<String>> arr) {

        List<List<String>> arrayList = new ArrayList<>();

//
//        Collections.sort(arr, (a,b)-> a.get(0).compareTo(b.get(0)));

        for(int i= 0; i<20; i++){
            arrayList.add(new ArrayList<>());
        }

        for(int i = 0; i<arr.size(); i++){
            int num = Integer.parseInt(arr.get(i).get(0));
            String ch = arr.get(i).get(1);
            if(i < arr.size()/2){
                ch = "-";
            }
            arrayList.get(num).add(ch);
        }

        List<String> sort = new ArrayList<>();

        for(List<String> list : arrayList){
            sort.addAll(list);
        }

        String ans = "";

        for(String n : sort){
            ans = ans + n + " ";
        }
         System.out.println(ans);
    }
}
