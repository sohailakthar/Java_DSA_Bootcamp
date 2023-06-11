package Medium;

import java.util.Arrays;

//https://leetcode.com/problems/product-of-array-except-self/description/
public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        int left = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0)
                left *= nums[i - 1];
            result[i] = left;
        }
        
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (i < (n-1))
                right *= nums[i + 1];
            result[i] *= right;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
