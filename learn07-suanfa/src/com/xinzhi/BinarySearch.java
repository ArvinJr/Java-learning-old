package com.xinzhi;

/**
 * @author arvin
 * @date 2021/2/3
 */
public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = {1,3,5,34,56,123,145,4567,23456};
        int target = 4567;

        int resultNumber = binarySearch(nums,target);

        if (resultNumber == -1){
            System.out.println("没有该数据");
        }else {
            System.out.println("是第" + resultNumber + "个！");
        }

    }

    public static int binarySearch(int[] nums, int target){

        // 定义边界
        int left = 0;
        int right = nums.length-1;
        int middle;

        // 处理边界
        if (target < nums[left] || target > nums[right]){
            return -1;
        }
        if (nums[left] == target){
            return 0;
        }
        if (nums[right] == target){
            return right;
        }

        // 查找目标值
        while (left < right){
            middle = (left+right) / 2;

            if (nums[middle] < target){
                left = middle+1;
            }else if (nums[middle] > target){
                right = middle-1;
            }else if (nums[middle] == target){
                return middle+1;
            }else if (left+1 == right){
                return -1;
            }
        }
        return -1;
    }
}
