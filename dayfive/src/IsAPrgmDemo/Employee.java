package IsAPrgmDemo;

public class Employee {
	
	private String name;
	private int empid;
	private String Dept;
	
	public Employee(){
		super();
		
	}

	public Employee(String name, int empid, String Dept) {
		super();
		this.name = name;
		this.empid = empid;
		this.Dept = Dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String Dept) {
		Dept =Dept;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", Dept=" + Dept + "]";
	}
	
	
}
