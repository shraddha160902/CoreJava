package daythree.com;

public class customer {
	private String customerName;
	private int customerId;
	private String customercity;
	
	public customer() {
		System.out.println("Default constructor");
	}
	
	public customer(String customerName,int customerId,String customercity){
		this();
		System.out.println("parameterized constructor");
		this.customerName=customerName;
		this.customerId=customerId;
		this.customercity=customercity;
		
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomercity() {
		return customercity;
	}

	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}

	@Override
	public String toString() {
		return "customer [customerName=" + customerName + ", customerId=" + customerId + ", customercity="
				+ customercity + "]";
	}
	

}
