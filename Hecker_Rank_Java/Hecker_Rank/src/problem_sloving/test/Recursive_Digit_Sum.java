package problem_sloving.test;

public class Recursive_Digit_Sum {

    public static void main(String[] args) {

//        String n ="9875";
//        int k = 4;
        String n = "  861568688536788";
        int k = 100000;


        System.out.println(Digit_Sum(n,k));

    }

    private static int Digit_Sum(String n, int k) {

        String s = "";
        char[] a = n.toCharArray();





        for(int i = 0; i<k; i++){
            for(int j = 0; j<a.length; j++){
                s =s + a[j] ;
            }
        }


        char[] newarr = s.toCharArray();
        int[] arr = new int[newarr.length];
         for(int i = 0; i<newarr.length; i++){
             String temp = String.valueOf(newarr[i]);
             arr[i] = Integer.parseInt(temp);
         }

        int size = arr.length;
        int ans = 0;

        if(size > 1){

             for(int i = 0; i<arr.length; i++){

                 ans = ans + arr[i];
             }

        }
        String news = String.valueOf(ans);
        if(news.length() > 1){

            return Digit_Sum(news,1);

        }
        System.out.println(ans);
        return 0;
    }
}








// char to String and integer  convert
//        int[] demo = new int[s.length()];
//        for(int i =0; i<s.length(); i++){
//         demo[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
//        }
//