package problem_sloving.week_2;

public class Flipper_Bit {

    public static long flippingBits(long n) {
        long bitmask = 0xFFFFFFFFL;
        return n ^ bitmask;
//         long  r =  (long)Math.pow(2, 32)-1;
//         return r-n;
    }

    public static void main(String[] args) {

        long[] testCases = {2147483647, 1, 0};

        for (long testCase : testCases) {
            System.out.println("Original: " + testCase + " -> Flipped: " + flippingBits(testCase));
        }
    }
}
