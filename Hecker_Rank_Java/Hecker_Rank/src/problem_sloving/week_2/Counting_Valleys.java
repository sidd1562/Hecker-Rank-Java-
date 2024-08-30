package problem_sloving.week_2;

public class Counting_Valleys {

    public static void main(String[] args) {

        String path= "DDUUDDUDUUUD";
        int step = path.length();

        System.out.println(CountFun(step,path));

    }

    private static int CountFun(int step, String path) {
        int temp = 0;
        int ia = 0;
        int count = 0;

        for(int i= 0; i<path.length(); i++){


            if(path.charAt(i) == 'D'){
                ia--;

            }else{
                ia++;

            }
            if(ia<0){
                temp = 1;

            }
            if(temp == 1 && ia == 0){
                count++;
                temp--;
            }


        }





     return  count;
    }
}
