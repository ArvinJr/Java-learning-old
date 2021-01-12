public class SelectSort {
    public static void main (String[] args){
        int[] nums = {2,3,1,9,6,4};
        int min,temp;

        for (int i = 0;i < nums.length-1;i++){
            /* i is the term num */
            min = i;

            for (int j = i+1;j < nums.length;j++) {
                // Which is the min
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }

                // Remove to top
                temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;


        }

        // Print out
        for (int i = 0;i < nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
