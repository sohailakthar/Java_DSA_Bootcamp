package Medium;

//https://leetcode.com/problems/jump-game/
public class JumpGame {
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        if(n==1 || (n==2 && nums[0]>0))
            return true;
        int goal = n-1;
        for(int i=goal-1; i>=0; i--) {
            if(nums[i]>=(goal-i)) {
                goal = i;
            }
        }
        if(goal == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
}
