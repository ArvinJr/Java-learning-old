/**
 *
 * @author arvin
 *
 */
public class BubbleSort {
    public static void main(String[] args){
        int[] nums = {3,7,4,9,5,4,1};
        int temp;

        for (int i = 0;i < nums.length-1;i++){
            for (int j = i+1;j < nums.length;j++){
                if (nums[j] < nums[i]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for (int i = 0;i < nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
