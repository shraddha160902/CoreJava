package map.com;

public class student {

	private int SIno;
	private String name;
	private int marks;
	
	public student() {
		super();
	}

	public student(int sIno, String name, int marks) {
		super();
		SIno = sIno;
		this.name = name;
		this.marks = marks;
	}

	public int getSIno() {
		return SIno;
	}

	public void setSIno(int sIno) {
		SIno = sIno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "SIno=" + SIno + ", name=" + name + ", marks=" + marks + "";
	}
	

}
