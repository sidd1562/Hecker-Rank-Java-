package problem_sloving.week_2;



import java.util.Scanner;

public class Lonely_Integer {

    public static  void  main(String[] args){


        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr= new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = s.nextInt();
        }

        int longvalue = findvalue(arr);

        System.out.println(longvalue);

    }

    private static int findvalue(int[] arr) {
        int longvalue = 0;
        for(int i = 0; i < arr.length; i++ ){
            longvalue ^= arr[i];
        }


        return longvalue;
    }


}