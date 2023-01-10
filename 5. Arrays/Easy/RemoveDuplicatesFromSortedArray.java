package Easy;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int k, cur;
        k = cur = 1;
        for(int i=1; (i<nums.length && cur<nums.length); i++) {
            if(nums[cur]==nums[k-1]) {
                cur++;
            } else {
                nums[k] = nums[cur];
                k++;
                cur++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
