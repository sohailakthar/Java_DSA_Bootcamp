package Easy;

//https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/description/
public class MinCostToMoveChipsToSamePosition {
    public static int minCostToMoveChips(int[] position) {
        int[] count = new int[2];
        for(int ele:position)
            ++count[ele%2];
        return Math.min(count[0], count[1]);
    }

    public static void main(String[] args) {
        int[] position = {2,2,2,3,3};
        System.out.println(minCostToMoveChips(position));
    }
}
