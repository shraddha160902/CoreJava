package comparableandcomparator;

public class student implements Comparable<student>{

	private int rollNo;
	private String name;
	private float per;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	public student(int rollNo, String name, float per) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.per = per;
	}
	public student() {
		super();
		
	}
	@Override
	public String toString() {
		return "student [rollNo=" + rollNo + ", name=" + name + ", per=" + per + "]";
	}
	
	public int compareTo(student s) {
		return s.name.compareTo(this.name);
	}
	
}
