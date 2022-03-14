package programs;
//16
import java.util.Scanner;

public class DataTest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Date myDate=new Date(12,19,2000);
		System.out.println("Enter the Month : ");
		int Mon=s.nextInt();
		myDate.setMonth(Mon);
		System.out.println("Enter the Day : ");
		int MyDay=s.nextInt();
		myDate.setDay(MyDay);
		System.out.println("Enter the Year : ");
		int MyYear=s.nextInt();
		myDate.setYear(MyYear);
		myDate.DisplayDate();
				
				
	}

}
