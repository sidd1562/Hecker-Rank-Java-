package problem_sloving.week_6;

public class Counter_game {
    public static void main(String[] args) {

        long s = 132l;
        System.out.println(counterGame(s));


    }

    public static String counterGame(long n) {



        int count = 0;

        while (n > 1) {

            if ((n & (n - 1)) == 0) {
                n = n / 2;
            } else {
                n = n - Long.highestOneBit(n);
            }
            count++;
        }


        if (count % 2 == 0) {
            return "Richard";
        } else {
            return "Louise";
        }
    }
}
