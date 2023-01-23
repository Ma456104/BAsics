package BookExercise;

public class MethodOverLoadingExp {
	public static void main(String[] args) {
		add(10, 20);
		add("Manish", 10);
		add("Manish", "Chouhan");
	}

	private static void add(String string, String string2) {
		System.out.println(string +" "+ string2);
	}

	private static void add(String string, int j) {
		System.out.println(string +" "+ j);

	}

	private static void add(int i, int j) {
		System.out.println(i + j);

	}

}
