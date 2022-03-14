package programs;
//15
public class Employee {
String firstName;
String lastName;
double monthlySalary;
public Employee(String firstname,String lastname,double  monthlysalary) {
	firstName=firstname;
	lastName=lastname;
	monthlySalary=monthlysalary;
}
public void setFirstName(String firstname) {
	firstName=firstname;
}
public String getFirstName() {
	return firstName;
}
public void setLastName(String lastname) {
	lastName=lastname;
}
public String getLastName() {
	return lastName;
}
public void setSalary(double salary) {
	monthlySalary=salary;
}
public double getSalary() {
	return monthlySalary;
}
}

