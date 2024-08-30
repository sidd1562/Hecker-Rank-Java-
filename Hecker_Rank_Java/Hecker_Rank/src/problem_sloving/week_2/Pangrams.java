package problem_sloving.week_2;

public class Pangrams {

    public static void main(String[] args) {

        String s = "We promptly judged antique ivory buckles for the next prize";
        String s1 = "We promptly judged antique ivory buckles for the prize";

        System.out.println(pangramsfun(s1));

    }

    private static String pangramsfun(String s) {
        s =s.toLowerCase();
        String sv= "";
       int count = 0;


       for(int i = 0; i<s.length(); i++){
           if(i == 19)
           {
               System.out.println(s.charAt(i));
           }
       }
       for(int i= 0; i<26; i++){
           int alpha = i+97;
           int vm = s.indexOf((char) (i+97));
           if(s.indexOf((char) (alpha) )== -1) {
               count++;
               break;
           }
       }

       if(count>0){
           sv = "not pangram";
       }else{
           sv = "pangram";
       }
        return  sv;
    }
}
