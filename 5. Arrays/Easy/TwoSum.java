package Easy;

import java.util.*;

public class TwoSum {
    public static int[] optimizedTwoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            hm.put(nums[i], i);
        }
        for(int i=0; i<nums.length; i++) {
            int comp = target-nums[i];
            if(hm.containsKey(comp) && hm.get(comp) != i) {
                return new int[] {i, hm.get(comp)};
            }
        }
        return null;
    }
    
    public static int[] twoSum(int[] nums, int target) {
        int sol[] = new int[2];
        int n = nums.length;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(nums[i]+nums[j]==target) {
                    sol[0] = i;
                    sol[1] = j;
                    return sol;
                }
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = optimizedTwoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
