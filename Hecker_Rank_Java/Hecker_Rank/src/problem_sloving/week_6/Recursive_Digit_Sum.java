package problem_sloving.week_6;

public class Recursive_Digit_Sum {
    public static void main(String[] args) {

//        String s = "9875";
//        int k = 4;

        String s = "861568688536788";
        int k = 100000;

        System.out.println(Fun(s,k));

    }

    private static int Fun(String n, int k) {

        long l=n.length()*k;
        int c=0;
        while(l>1l)
        {
            long SOS=0l;
            for(int i=0;i<n.length();i++)
            {
                char v = n.charAt(i);
                SOS = SOS + Long.parseLong(""+ v );
            }
            if(c==0)
            {
                SOS = SOS * k;
                c++;
            }
            n=Long.toString(SOS);
            l=n.length();
        }
        return Integer.parseInt(n);
    }
}
