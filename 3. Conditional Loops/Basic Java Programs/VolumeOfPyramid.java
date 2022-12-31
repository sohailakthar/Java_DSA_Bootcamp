import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int baseWidth, baseLength, Height, volume;

        System.out.print("Enter baseWidth: ");
        baseWidth = sc.nextInt();
        System.out.print("Enter baseLength: ");
        baseLength = sc.nextInt();
        System.out.print("Enter prismHeight: ");
        Height = sc.nextInt();

        volume = (baseWidth*baseLength*Height)/3;

        System.out.printf("Volume of pyramid with baseLength:%d, baseWidth:%d, Height:%d is %d", baseLength, baseWidth, Height, volume);

        sc.close();
    }
}
