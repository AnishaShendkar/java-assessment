package programs;
//10
import java.util.Scanner;
public class Sphere {

	public static double sphereVolume(double radius) {
		return (4.0/3.0)* Math.PI * Math.pow(radius,3);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double rad=0.0,vol=0.0;
		System.out.println("Enter Radius : ");
		rad=s.nextInt();
		System.out.printf("Volume = %.3f",sphereVolume(rad));
	}

}

