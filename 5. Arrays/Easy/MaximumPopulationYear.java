package Easy;
//https://leetcode.com/problems/maximum-population-year/description/

public class MaximumPopulationYear {

    public static int maximumPopulation(int[][] logs) {
        int[] counts = new int[100];
        int max = Integer.MIN_VALUE;
        int result=0;
        for(int[] arr : logs) {
            for(int i=arr[0]-1950; i<arr[1]-1950; i++) {
                counts[i]++;
            }
        }
        for(int i=0; i<100; i++) {
            if(counts[i] > max) {
                max = counts[i];
                result = i;
            }
        }
        return (result+1950);
    }
    
    public static void main(String[] args) {
        int[][] input = {{1993,1999},{2000,2010}};
        int output = maximumPopulation(input);
        System.out.println(output);
    }
}
