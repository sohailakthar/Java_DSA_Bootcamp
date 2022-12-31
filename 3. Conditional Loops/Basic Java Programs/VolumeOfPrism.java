import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int baseWidth, baseHeight, prismHeight, volume;

        System.out.print("Enter baseWidth: ");
        baseWidth = sc.nextInt();
        System.out.print("Enter baseHeight: ");
        baseHeight = sc.nextInt();
        System.out.print("Enter prismHeight: ");
        prismHeight = sc.nextInt();

        volume = (baseWidth*baseHeight*prismHeight)/2;

        System.out.printf("Volume of prism with baseHeight:%d, baseWidth:%d, prismHeight:%d is %d", baseHeight, baseWidth, prismHeight, volume);

        sc.close();
    }
}
