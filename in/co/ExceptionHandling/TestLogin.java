package in.co.ExceptionHandling;

public class TestLogin {
public static void main(String[] args) {
	String name = "Admi";
	if (name == "Admin") {
		System.out.println("Valid");
	}else {
		try {
			throw new LoginExeption();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
}
