package multilevelinheritance;
import java.util.Date;
public class employee extends person {
  
	private String deptnum;
	private double salary;
	
	public employee(){
	//System.out.print("Employee Details:");
	}
	public employee(String name,long contactno,Date dateofbirth,String deptnum, double salary) {
		super(name,contactno,dateofbirth);
		this.deptnum=deptnum;
		this.salary=salary;
	}
	public String getDeptnum() {
		return deptnum;
	}
	public void setDeptnum(String deptnum) {
		this.deptnum = deptnum;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "employee [deptnum=" + deptnum + ", salary=" + salary + ", Name()=" + getName() + ", Contactno()="
				+ getContactno() + ", Dateofbirth()=" + getDateofbirth() + "]";
	}
		
	}

