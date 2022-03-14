package programs;
//2
import java.util.Scanner;
public class Product {
	public static void main(String args[]) {
		int product=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of your choice : \n");
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		product=x*y*z;
		System.out.println("the product of given three numbers are : "+product);
		}

}
