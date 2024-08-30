package problem_sloving.week_2;

public class Mars_Exploration {


    public static void main(String[] args) {

//
//        String s ="SOSSPSSQSSOR";
        String s ="SOSSOSSOS";
        System.out.println(March(s));


    }

    private static int March(String s) {
        s.toUpperCase();
        int count = 0;
        String ss = "SOS";
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != ss.charAt(i % 3)){
              count++;
            }
        }

        return count;



    }
}
