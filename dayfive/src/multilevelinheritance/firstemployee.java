package multilevelinheritance;
import java.util.Date;
public class firstemployee extends employee {

	private int noOfShares;
	private String authority;
	
	public firstemployee(){
		//System.out.print(" First Employee Details:");
		}
		
	public firstemployee(String name,long contactno,Date dateofbirth,String deptnum, double salary,int noOfShares,String authority) {
			super(name,contactno,dateofbirth,deptnum,salary);
			this.noOfShares=noOfShares;
			this.authority=authority;
			
	}
	public int getNoOfShares() {
		return noOfShares;
	}

	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "firstemployee [noOfShares=" + noOfShares + ", authority=" + authority + ", Deptnum()=" + getDeptnum()
				+ ", Salary()=" + getSalary() + ", Name()=" + getName() + ", Contactno()=" + getContactno()
				+ ", Dateofbirth()=" + getDateofbirth() + "]";
	}
	
}