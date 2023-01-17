package Easy;

//https://leetcode.com/problems/sqrtx/description/
public class SquareRoot {
    public static int mySqrt(int x) {
        if(x<2) return x;
        int start = 1, end = x / 2;
        while(start <= end){
            int mid = start+ (end-start)/2;
            if(x / mid == mid)
                return mid;
            else if(mid > x/mid)
                end= mid-1;
            else
                start = mid+1;
        }
        return end;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(16));
    }
}
