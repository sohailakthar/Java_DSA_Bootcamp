package Easy;

import java.util.Scanner;

public class FindHighestAltitude {
    public static int largestAltitude(int[] gain) {
        int maxAltitude, altitudeGain;
        maxAltitude = altitudeGain = 0;

        for(int i:gain) {
            altitudeGain += i;
            maxAltitude = (maxAltitude>(altitudeGain))?maxAltitude:altitudeGain;
        }
        return maxAltitude;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] input = new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0; i<n; i++) {
            input[i] = sc.nextInt();
        }
        System.out.println("Max altitude is: "+largestAltitude(input));


        sc.close();
    }
}
