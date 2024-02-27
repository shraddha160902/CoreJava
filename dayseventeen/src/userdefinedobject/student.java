package userdefinedobject;

import java.util.Objects;

public class student {

	int marks;
	String name;
	
	
	public student(int marks, String name) {
	
		this.marks = marks;
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int hashCode() {
		final int prime=31;
		int result=1;
		result=prime*result+marks;
		result=prime*result+((name==null)?0:name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		
		//comparing the state of argument with
		// the state of 'this' Object
		if (marks != other.marks)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		}
		else if (!name.equals(other.name))
			return false;
		return true;
		
		
		
		
		//return marks == other.marks && Objects.equals(name, other.name);
	}


	@Override
	public String toString() {
		return "student [marks=" + marks + ", name=" + name + "]";
	}
	
	
}
