public class Employee{
	public String name (String name) {
	return name;
	}
	public String Address(String Address) {
		return Address;
	}
	public int year(int n) {
	return n;
	}
	public double salary(double s) {
		return s;
	}
public static void main(String[] args) {
	Employee obj = new Employee();
	System.out.println("Name of Employee:"+obj.name("Arpita"));
	System.out.println("Year of joining:"+obj.year(2020));
	System.out.println("Address:"+obj.Address("Jamshedpur"));
	System.out.println("Name of Employee:"+obj.name("Preeti Bhushan"));
	System.out.println("Year of joining:"+obj.year(2021));
	System.out.println("Address:"+obj.Address("patel nagar, Bihar"));
	System.out.println("Name of Employee:"+obj.name("Adnan Siddiquee"));
	System.out.println("Year of joining:"+obj.year(2021));
	System.out.println("Address:"+obj.Address("Nagpur,Maharashtra"));
	
}
}
	

