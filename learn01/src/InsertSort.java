/**
 * @author arvin
 */
public class InsertSort {
    public static void main(String[] args){
        int[] nums = {12,1,5,9,1,4};
        int temp;

        for (int i = 1;i < nums.length;i++){
            temp = nums[i];
            for (int j = i-1;j >= 0;j--){
                if (temp < nums[j]){
                    nums[j+1] = nums[j];
                    if (j == 0){
                        nums[0] = temp;
                    }
                }else {
                    nums[j+1] = temp;
                    break;
                }
            }
        }

        for (int i = 0;i < nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
