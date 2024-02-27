package dayfive.com;

public class citizen {

	private String name;
	private String aadharno;
	private String address;
	private long phoneno;
	
	public citizen() {
		System.out.println("citizen object created");
	}

	
	
	public citizen(String name, String aadharno, String address, long phoneno) {
		super();
		this.name = name;
		this.aadharno = aadharno;
		this.address = address;
		this.phoneno = phoneno;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAadharno() {
		return aadharno;
	}

	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "citizen [name=" + name + ", aadharno=" + aadharno + ", address=" + address + ", phoneno=" + phoneno
				+ "]";
	}
	
	}

