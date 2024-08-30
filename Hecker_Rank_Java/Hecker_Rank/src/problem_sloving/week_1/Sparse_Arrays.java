package problem_sloving.week_1;
import java.util.ArrayList;
import java.util.List;



import java.util.ArrayList;
import java.util.List;

public class Sparse_Arrays {
    public static List<Integer> countQueries(List<String> queries, List<String> strings) {
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < queries.size(); i++) {
            int count = 0;
            for (int j = 0; j < strings.size(); j++) {
                if (queries.get(i).equals(strings.get(j))) {
                    count++;
                }
            }
            arr.add(count);
        }

        return arr;
    }

    public static void main(String[] args) {
        List<String> queries = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        // Sample data
        queries.add("apple");
        queries.add("banana");
        queries.add("cherry");

        strings.add("apple");
        strings.add("banana");
        strings.add("apple");
        strings.add("apple");
        strings.add("cherry");
        strings.add("banana");
        strings.add("banana");
        strings.add("cherry");
        strings.add("cherry");
        strings.add("cherry");

        List<Integer> result = countQueries(queries, strings);
        System.out.println(result); // Output should be [3, 3, 4]
    }
}

