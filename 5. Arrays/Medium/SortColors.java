package Medium;

import java.util.Arrays;

//https://leetcode.com/problems/sort-colors/description/
public class SortColors {
    public static void sortColors(int[] nums) {
        int redCount, whiteCount, blueCount, n;
        redCount = whiteCount = blueCount = 0;
        n = nums.length;
        if(n>1) {
            for(int i=0; i<n; i++) {
                if(nums[i] == 0)
                    redCount++;
                else if(nums[i] == 1)
                    whiteCount++;
                else if(nums[i] == 2)
                    blueCount++;
            }

            for(int i=0; i<n; i++) {
                while(redCount-- > 0) {
                    nums[i++] = 0;
                }
                while(whiteCount-- > 0) {
                    nums[i++] = 1;
                }
                while(blueCount-- > 0) {
                    nums[i++] = 2;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
