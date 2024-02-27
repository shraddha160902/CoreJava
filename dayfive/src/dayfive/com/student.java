package dayfive.com;

public class student extends citizen{
 private int rollno;
 private String collegename;
 
 public student() {
	 super();
 }
 public student(String name,String aadharno,String address,long phoneno,int rollno,String collegename) {
 super( name,aadharno, address, phoneno);
 this.rollno=rollno;
 this.collegename=collegename;
 }
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getCollegename() {
	return collegename;
}
public void setCollegename(String collegename) {
	this.collegename = collegename;
}
@Override
public String toString() {
	return "student [rollno=" + rollno + ", collegename=" + collegename + ", Name()=" + getName()
			+ ", Aadharno()=" + getAadharno() + ", Address()=" + getAddress() + ", Phoneno()=" + getPhoneno()
			+ "]";
}
 
}
