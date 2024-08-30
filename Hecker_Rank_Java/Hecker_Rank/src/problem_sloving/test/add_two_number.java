package problem_sloving.test;

import java.util.HashMap;
import java.util.Map;

public class add_two_number {

    public static void main(String[] args) {


        int[] arr= {2,3,1,6,7};

        System.out.println(countTriplets(arr));




    }


        public static int countTriplets(int[] arr) {
//            int n = arr.length;
//            int[] p = new int[n + 1];
//
//            for (int i = 0; i < n; i++) {
//                p[i + 1] = p[i] ^ arr[i];
//            }
//
//            int count = 0;
//            for (int i = 0; i < n; i++) {
//                for (int k = i + 1; k < n; k++) {
//                    if (p[i] == p[k + 1]) {
//                        count = count + (k - i);
//                    }
//                }
//            }
//
//            return count;
//-----------------------------------------------------------------------------------------------------------------------
//            int n = arr.length;
//            Map<Integer, Integer> countMap = new HashMap<>();
//            Map<Integer, Integer> indexMap = new HashMap<>();
//
//            int p = 0;
//            int count = 0;
//
//
//            countMap.put(0, 1);
//            indexMap.put(0, 0);
//
//            for (int i = 0; i < n; i++) {
//                p = p ^ arr[i];
//
//                if (countMap.containsKey(p)) {
//                    count = count + countMap.get(p) * i - indexMap.get(p);
//                }
//
//                countMap.put(p, countMap.getOrDefault(p, 0) + 1);
//                indexMap.put(p, indexMap.getOrDefault(p, 0) + (i + 1));
//            }
//
//            return count;
//        }
//---------------------------------------------------------------------------------------------------------------------



            int count = 0;
            int n = arr.length;
            for(int i = 0; i < n; i++){
                int xor = 0;
                for(int j = i; j < n; j++){
                    xor ^= arr[j];
                    if(xor == 0) {

                        count = count + (j - i);
                    }
                }
            }

            return count;
        }
}
