package problem_sloving.week_6;

public class sum_xor {


    public static void main(String[] args) {

        long value = 10;
        System.out.println(sum_xor_fun(value));

    }

    private static long sum_xor_fun(long value) {
        long count = 0;

        while (value != 0){

            count += (value % 2 == 0) ? 1:0;
            value = value/2;
        }
        count = (long) Math.pow(2,count);

        return count;

    }


}
