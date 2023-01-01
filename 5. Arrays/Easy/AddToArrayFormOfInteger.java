package Easy;

import java.util.LinkedList;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List res = new LinkedList<>();
        for (int i = num.length - 1; i >= 0 || k > 0; --i) {
            res.add(0, (i >= 0 ? num[i] + k : k) % 10);
            k = (i >= 0 ? num[i] + k : k) / 10;
        }
        return res;
    }
    
    public static void main(String[] args) {
        int k = 34;
        int[] num = {1, 2, 0, 0};
        System.out.println(addToArrayForm(num, k));
    }
}
