package programs;
//8
import java.util.Scanner;
public class Multiple {
	public static void main(String args[]) {
		int x=0,y=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any two numbers : \n");
		x=s.nextInt();
		y=s.nextInt();
		int mul=y%x;
		if(mul==0) {
			System.out.printf("%d is a multiple of %d",x,y);
		}
		else {
			System.out.printf("%d is not  a multiple of %d",x,y);
		}
	}

}
