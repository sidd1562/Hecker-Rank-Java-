package problem_sloving.test.leet;

public class sum {
    public static void main(String[] args) {

        int[] n  = {3,2,4};
        int traget = 6;

        System.out.print(FUNSUM(n,traget)[0]);
        System.out.print(" ");
        System.out.println(FUNSUM(n,traget)[1]);


    }

    private static int[] FUNSUM(int[] n, int target) {



        int[] s = new int[2];
        int ans = 0;
        for(int i = 0; i<n.length; i++){

            for(int j = i+1; j<n.length; j++ ){

                ans = n[i] + n[j];
                if(ans == target){

                    s[0] = i;
                    s[1] = j;
                    break;
                }

            }


        }
        return s;
    }
}
