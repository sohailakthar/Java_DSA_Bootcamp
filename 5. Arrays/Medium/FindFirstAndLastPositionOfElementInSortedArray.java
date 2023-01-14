package Medium;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FindFirstAndLastPositionOfElementInSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        double left = target - 0.5, right = target + 0.5;
        int l = binarySearch(nums, left), r = binarySearch(nums, right);
        if(l == r) return new int[]{-1, -1};
        return new int[]{l, r-1};
    }
    
    public static  int binarySearch(int[] nums, double target) {
        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(target > nums[mid]) low = mid+1;
            else high = mid-1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums, 8)));
    }
}
