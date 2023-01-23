package in.co.collect;

public class Marksheet {
	private String rollNo;
	private String name;
	private int physics;
	private int chemistry;
	private int maths;

	public Marksheet(String rollNo, String name, int physics, int chemistry, int maths) {
	//	super();
		this.rollNo = rollNo;
		this.name = name;
		this.physics = physics;
		this.chemistry = chemistry;
		this.maths = maths;
	}

	public String getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public int getPhysics() {
		return physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public int getMaths() {
		return maths;
	}
	
	

}
