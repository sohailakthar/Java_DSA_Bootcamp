import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        
        int radius;
        double volume;

        System.out.print("Enter radius: ");
        radius = sc.nextInt();
        volume = (1.333)*(Math.PI*Math.pow(radius, 3));
        System.out.printf("Volume of sphere with radius:%d is %.2f", radius, volume);
        

        sc.close();
    }
}
