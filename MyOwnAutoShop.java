package programs;
//19
import java.util.*;
public class MyOwnAutoShop {
	public static void main(String[] args) {
		Car car=new Car(120,500000,"Silver");
		Sedan sedan=new Sedan(180,350000,"Dark BLue",0);
		Ford ford=new Ford(190,300000,"Black",1978,25);
		Ford ford2=new Ford(200,450000,"Sea Green",1988,10);
		System.out.println("Sales Price of Car : "+car.getSalesPrice());
		System.out.println("Sales Price of Sedan : "+sedan.getSalesPrice());
		System.out.println("Sales Price of Car : "+ford.getSalesPrice());
		System.out.println("Sales Price of Car : "+ford2.getSalesPrice());
	}

}
