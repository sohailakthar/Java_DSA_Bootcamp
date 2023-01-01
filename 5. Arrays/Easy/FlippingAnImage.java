package Easy;

public class FlippingAnImage {
    public static int[][] flipAndInvertImage(int[][] image) {
        int i=0, j, n=image.length;
        int result[][] = new int[n][n];
        
        for(int[] arr:image) {
            for(j=0; j<arr.length; j++) {
                result[i][j] = (arr[arr.length-1-j]==0)?1:0;
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] result = flipAndInvertImage(image).clone();
        for(int[] arr:result) {
            for(int i:arr) {
                System.out.printf("%d  ", i);
            }
            System.out.println("");
        }
    }
}
