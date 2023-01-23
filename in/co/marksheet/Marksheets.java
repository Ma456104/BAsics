package in.co.marksheet;

public class Marksheets implements Comparable<Marksheets> {
	String rollNum;
	String firstName;
	String lastName;
	int mark;

	public Marksheets(String rollNum, String firstName, String lastName, int mark) {
		super();
		this.rollNum = rollNum;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mark = mark;
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

	public int getMark() {
		return mark;
	}

	@Override
	public int compareTo(Marksheets m) {

		return rollNum.compareTo(m.rollNum);
	}

	@Override
	public String toString() {

		return rollNum + " , " + firstName + " , " + lastName + " , " + mark;
	}

}
