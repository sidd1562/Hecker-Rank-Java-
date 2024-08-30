package problem_sloving.week_6;

import java.util.*;

public class Sherlock_Array {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < n; i++) {
            rightSum += arr[i];
        }

        for (int i = 0; i < n; i++) {
            rightSum -= arr[i];
            if (leftSum == rightSum) {
                System.out.println("YES");
                return;
            }
            leftSum += arr[i];
        }

        System.out.println("NO");
    }
}