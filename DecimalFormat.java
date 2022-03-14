package programs;
//12
import java.util.Scanner;
public class DecimalFormat {
	public static double Average(int grades[],int max) {
		int sum=0;
		double avg=0.0;
		for(int i=1;i<max;i++) {
			sum+=grades[i];
			avg=sum/(i);
		}
		return avg;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i,grades[];
	    grades=new int[20];
		for(i=0;i<20;i++) {
			System.out.printf("Enter Grades: ");
			grades[i]=s.nextInt();
			if(grades[i]==-1)
				break;
		}
		System.out.printf("Average is : %2f",Average(grades,i-1));
		}
	}
	

