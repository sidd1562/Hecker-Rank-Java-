package problem_sloving.test;

public class sort {

    public void sortColors(int[] nums ){
        int t = 0, k = nums.length - 1;
        for (int i = 0; i < nums.length; ) {
            if (nums[i] == 0 && i != t) {
                int temp = nums[t];
                nums[t] = nums[i];
                nums[i] = temp;
                t++;
            } else if (k > i && nums[i] == 2) {
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                k--;
            } else {
                i++;
            }
        }

        for(int i : nums){
            System.out.print(i + " ");
        }
    }

    public static  void main(String[] args){
        sort s = new sort();
        int[] arr = {2,0,2,1,1,0};  //12,554,69,4,5
        s.sortColors(arr);

    }
}
