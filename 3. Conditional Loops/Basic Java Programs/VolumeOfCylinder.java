import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        
        int radius, height;
        double volume;

        System.out.print("Enter radius: ");
        radius = sc.nextInt();
        System.out.print("Enter height: ");
        height = sc.nextInt();
        volume = Math.PI * (radius*radius) * (height);
        System.out.printf("Volume of cylinder with radius:%d and height:%d is %.2f", radius, height, volume);
        

        sc.close();
    }
}
