package Easy;

import java.util.Arrays;

public class UniqueIntegersSumUptoZero {
    public static int[] res(int n) {
        if(n==1) {
		    return new int[] {0};
		}
		else if(n%2 != 0) {
		    int[] result = new int[n];
		    result[n/2] = 0;
		    for(int i=0, j=(n/2)+1; (i<(n/2) && j<n); i++, j++) {
		        result[i] = i+1;
		        result[j] = -i-1;
		    }
		    return result;
		}
		else if(n%2 == 0) {
		    int[] result = new int[n];
		    for(int i=0, j=(n/2); (i<(n/2) && j<n); i++, j++) {
		        result[i] = i+1;
		        result[j] = -i-1;
		    }
		    return result;
		}
		return null;
    }
    
	public static void main(String[] args) {
		int n = 6;
		System.out.println(Arrays.toString(res(n)));
	}
}
