package problem_sloving.test;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class full_count_sort {

    public  void count(List<List<String>> arr) {
        int n = arr.size();
        List<List<String>> counts = new ArrayList<>();


        for (int i = 0; i < 22; i++) {
            counts.add(new ArrayList<>());
        }


//        Collections.sort(arr, (a,b) -> a.get(0).compareTo(b.get(0)));
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(arr.get(i).get(0));
            String str = arr.get(i).get(1);
            if (i < n / 2) {
                str = "-";
            }
            counts.get(num).add(str);
        }


        List<String> sorted = new ArrayList<>();
        for (List<String> list : counts) {
            sorted.addAll(list);
        }


        StringBuilder result = new StringBuilder();
        for (String str : sorted) {
            result.append(str).append(" ");
        }
        System.out.println(result.toString().trim());
    }



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


        arr.add(Arrays.asList("1", "e"));
        arr.add(Arrays.asList("2", "a"));
        arr.add(Arrays.asList("1", "b"));
        arr.add(Arrays.asList("3", "b"));
        arr.add(Arrays.asList("4", "f"));
        arr.add(Arrays.asList("1", "f"));
        arr.add(Arrays.asList("2", "a"));
        arr.add(Arrays.asList("1", "e"));
        arr.add(Arrays.asList("1", "b"));
        arr.add(Arrays.asList("1", "c"));
        full_count_sort s = new full_count_sort();

        s.count(arr);


    }
}
