package IsAPrgmDemo;

public class manager extends Employee {

	private int teamsize;
	
	public manager() {
		super();
		
	}

	public manager(String name, int empid, String Dept,int teamsize) {
		super(name,empid,Dept);
		this.teamsize = teamsize;
	}

	public int getTeamsize() {
		return teamsize;
	}

	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}

	@Override
	public String toString() {
		return "manager [teamsize=" + teamsize + ", Name=" + getName() + ", Empid=" + getEmpid()
				+ ", Dept=" + getDept() + "]";
	}
	
	
}
