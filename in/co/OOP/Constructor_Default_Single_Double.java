package in.co.OOP;

public class Constructor_Default_Single_Double {
	
	//This is Default Constructor
	public Constructor_Default_Single_Double() {
		System.out.println("i'm Default Constructor!! ");
	}

	//This is Single Constructor
	public Constructor_Default_Single_Double(String name, int num) {
		this();
		System.out.println("i'm Dual Constructor!!");
		System.out.println(name + num);
	}
	
	//This is Dual parmetrized Constructor
	public Constructor_Default_Single_Double(String name, String Surname, int MoNum) {
		this(name,MoNum);
		System.out.println("i'm Triple Constructor !!");
		System.out.println(name + " = Name " + Surname + " = Surname" + MoNum + " = Mo Num");
	}

}
