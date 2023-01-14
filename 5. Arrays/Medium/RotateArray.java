package Medium;

import java.util.Arrays;

//https://leetcode.com/problems/rotate-array/description/
public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if(nums == null || n < 2) {
            return;
        }
        k = k % n;
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);    
    }

    private static void reverse(int[] nums, int i, int j) {
        int temp = 0;       
        while(i < j) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}
