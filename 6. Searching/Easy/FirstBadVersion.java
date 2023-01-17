package Easy;

//https://leetcode.com/problems/first-bad-version/description/
public class FirstBadVersion {

    public static boolean isBadVersion(int num, int bad) {
        return (num==bad);
    }

    public static int firstBadVersion(int n, int bad) {
        int start = 1; 
        int end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid, bad)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5, 4));
    }
}
