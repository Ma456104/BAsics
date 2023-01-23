package in.co.collect;

public class Marksheet1 implements Comparable<Marksheet1>{
	String rollNum;
	String firstName;
	String lastName;
	int marks;

	public Marksheet1(String rollNum, String firstName, String lastName, int marks) {
		super();
		this.rollNum = rollNum;
		this.firstName = firstName;
		this.lastName = lastName;
		this.marks = marks;
	}

	public String getRollNum() {
		return rollNum;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public int compareTo(Marksheet1 m) {

		return rollNum.compareTo(m.rollNum);
	}

	@Override
	public String toString() {

		return rollNum +" , "+firstName+ " , "+lastName+" , "+marks;
	}

}
