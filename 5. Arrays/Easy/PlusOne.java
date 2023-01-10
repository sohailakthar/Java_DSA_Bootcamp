package Easy;

import java.util.Arrays;

public class PlusOne {
    public static int[] add(int[] digits, int index) {
        if(digits[index]==9) {
            digits[index] = 0;
            return add(digits, index-1);
        }
        else {
            digits[index]++;
            return digits;
        }
    }

    public static int[] plusOne(int[] digits) {
        int count = 0;
        for(int ele:digits) {
            count++;
            if(ele != 9)
                break;
            if(count == digits.length) {
                int[] res = new int[digits.length+1];
                res[0] = 1;
                return res;
            }
        }
        int index = (digits.length)-1;
        return add(digits, index);
    }

    public static void main(String[] args) {
        int[] digits = {3, 8, 3, 9, 3, 4, 9, 1, 0, 3, 9, 4, 6, 8};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
