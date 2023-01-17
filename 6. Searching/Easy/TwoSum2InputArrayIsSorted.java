package Easy;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
import java.util.Arrays;

public class TwoSum2InputArrayIsSorted {
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        while(start<end) {
            long v = numbers[start]+numbers[end];
            if(v == target) {
                return new int[]{start+1, end+1};
            }
            if(v>target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }
}
