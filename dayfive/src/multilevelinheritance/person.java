package multilevelinheritance;
import java.util.Date;
public class person {

private String name;
private long contactno;
private Date dateofbirth;


public person(){
	//System.out.print("----------------------------");
	}

public person(String name,long contactno,Date dateofbirth) {
	super();
	this.name=name;
	this.contactno=contactno;
	this.dateofbirth=dateofbirth;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public long getContactno() {
	return contactno;
}

public void setContactno(long contactno) {
	this.contactno = contactno;
}

public Date getDateofbirth() {
	return dateofbirth;
}

public void setDateofbirth(Date dateofbirth) {
	this.dateofbirth = dateofbirth;
}

@Override
public String toString() {
	return "person [name=" + name + ", contactno=" + contactno + ", dateofbirth=" + dateofbirth + "]";
}

}
