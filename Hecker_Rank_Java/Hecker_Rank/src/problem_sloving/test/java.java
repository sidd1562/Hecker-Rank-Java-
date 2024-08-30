package problem_sloving.test;

// class java{
//     public static void main(String[] args) {

//       int[] arr = {5,3,12,1,7};

//       for(int i= 0; i<arr.length; i++){
//         for(int j = i+1; j<arr.length; j++){
//              if(arr[i] > arr[j]) {
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//              }
//         }
//       }
//          for(int i : arr){
//             System.out.println(i);
//          }


//     }
// }

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class java {


    public static void main(String[] args) {


        List<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= 52; i++) {
            arr.add(i);
        }


        List<Integer> t1 = new ArrayList<>();
        List<Integer> t2 = new ArrayList<>();
        List<Integer> t3 = new ArrayList<>();
        List<Integer> t4 = new ArrayList<>();
        List<Integer> tf = new ArrayList<>();

        Random s = new Random();


        while (t1.size() < 4 && arr.size() > 0) {
            int randomIndex = s.nextInt(arr.size());
            int randomNumber = arr.get(randomIndex);
            t1.add(randomNumber);
            arr.remove(randomIndex);
        }

        while (t1.size() == 4 && t2.size() < 4 ) {
            int randomIndex = s.nextInt(arr.size());
            int randomNumber = arr.get(randomIndex);
            t2.add(randomNumber);
            arr.remove(randomIndex);
        }
        while (t2.size() == 4 && t3.size() < 4 ) {
            int randomIndex = s.nextInt(arr.size());
            int randomNumber = arr.get(randomIndex);
            t3.add(randomNumber);
            arr.remove(randomIndex);
        }
        while (t3.size() == 4 && t4.size() < 4) {
            int randomIndex = s.nextInt(arr.size());
            int randomNumber = arr.get(randomIndex);
            t4.add(randomNumber);
            arr.remove(randomIndex);
        }

        int maxt1 = Integer.MIN_VALUE;
        for (int a : t1) {
            System.out.println(" t1 " + a);
            if(a>maxt1){
                maxt1 = a;
            }
        }
//        System.out.println("max value " + maxt1);
        tf.add(maxt1);

        int maxt2 = Integer.MIN_VALUE;
        for (int b : t2) {
            System.out.println(" t2 " + b);
            if(b>maxt2){
                maxt2 = b;
            }
        }
        tf.add(maxt2);
        int maxt3 = Integer.MIN_VALUE;
        for (int c : t3) {
            System.out.println(" t3 " + c);
            if(c>maxt3){
                maxt3 = c;
            }
        }
        tf.add(maxt3);
        int maxt4 = Integer.MIN_VALUE;
        for (int d : t4) {
            System.out.println(" t4 " + d);
            if(d>maxt4){
                maxt4 = d;
            }
        }
        tf.add(maxt4);
        int maxfl = Integer.MIN_VALUE;
        for(int v : tf){

            if(v>maxfl){
                maxfl = v;
            }

    }

System.out.println(maxfl);


    }
}