package in.co.Abstraction;

public class ParsonEmployeeTest {
public static void main(String[] args) {
	Person p = new Person("Manish", "Chouhan", "16/1, Sadar Bazar, Indore");
//	p.firstName = "Manish";
//	p.lastName = "Chouhan";
//	p.address = "16/1, Sadar Bazar, Indore";
	System.out.println(p.firstName);
	System.out.println(p.lastName);
	System.out.println(p.address);
	
	Employee e = new Employee("Neha", "Lokhande", "Doctor");
	System.out.println(e.firstName);
	System.out.println(e.lastName);
	System.out.println(e.address);
	
	
}
}
