package Easy;

public class PerfectSquare {
    public static boolean isPerfectSquare(int num) {
        if(num==1)
            return true;
        long start = 1;
        long end = num/2;
        while(start<=end) {
            long mid = start+(end-start)/2;
            if((mid*mid)==num) {
                return true;
            }
            else if((mid*mid)>num) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(81));
    }
}
