package in.ineuron.comp;

public class Company {
	
	private String name;
	private String address;
	private int size;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Company [name=" + name + ", address=" + address + ", size=" + size + "]";
	}
	
	

}
