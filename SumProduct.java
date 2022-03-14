package programs;
//5

import java.util.Scanner;

public class SumProduct {
		public static void main(String args[]) {
			int sum;
			int  product;
			int difference=0;
			int quotient=0;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter any two number of your choice : \n");
			int x=s.nextInt();
			int y=s.nextInt();
			sum=x+y;
			product=x*y;
			difference=x-y;
			quotient=x/y;
			System.out.println("Sum is : "+sum+"\nProduct is : "+product+"\nDifference is : "+difference+"\nQuotient is : "+quotient);
}
}
