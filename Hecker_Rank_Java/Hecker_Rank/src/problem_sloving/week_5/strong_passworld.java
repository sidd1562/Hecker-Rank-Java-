package problem_sloving.week_5;

import  java.util.*;

public class strong_passworld {

    public static int minimumNumber(int n, String password) {



        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";

        int c=0;
        int i=0;
        int j=0;
        int k=0;
        int l=0;

        for(int x=0;x<n;x++)
        {
            String s=(password.charAt(x)+"");
            if(numbers.contains(s))
            {
                i++;
            }
            if(lower_case.contains(s))
            {
                j++;
            }
            if(upper_case.contains(s))
            {
                k++;
            }
            if(special_characters.contains(s))
            {
                l++;
            }
        }
        if(i==0)
        {
            c++;
        }
        if(j==0)
        {
            c++;
        }
        if(k==0)
        {
            c++;
        }
        if(l==0)
        {
            c++;
        }
        if(c+n<6)
        {
            c=c+6-(c+n);
        }
        return c;



}
    public static void main(String[] args){

        String s = "Api";
        int  n = 3;

       System.out.println(minimumNumber(n,s));

    }
}
