package programs;
//7
import java.util.Scanner;
public class SumAvg {
	public static void main(String args[]) {
		int sum=0;
		int product=0;
		int avg=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any Three Integers :\n");
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		sum=x+y+z;
		product=x*y*z;
		avg=(x+y+z)/2;
		//System.out.println("Sum is : "+sum+"\nAverage is : "+avg+"\nProduct is : "+product);
		if(x<y && x<z) {
			System.out.println("Sum is : "+sum+"\nAverage is : "+avg+"\nProduct is : "+product+"\nsmalest number is : "+x);
		}
		else if(y<x && y<z) {
			System.out.println("Sum is : "+sum+"\nAverage is : "+avg+"\nProduct is : "+product+"\nsmalest number is : "+y);
		}
		else {
			System.out.println("Sum is : "+sum+"\nAverage is : "+avg+"\nProduct is : "+product+"\nsmalest number is : "+z);
		}
		if(x>y && x>z) {
			System.out.println("largest number is : "+x);
		}
		else if(y>x && y>z) {
			System.out.println("largest number is : "+y);
		}
		else {
			System.out.println("largest number is : "+z);
		}

				}

}
