package in.ineuron.component;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "org.info")
public class Company {
	
	private String name;
	private String location;
	private Integer size;
	private String pincode;
	
	
	static{
		System.out.println("Company.class is loading..");
	}

	Company(){
		System.out.println("company constructor is instantiated...");
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Integer getSize() {
		return size;
	}


	public void setSize(Integer size) {
		this.size = size;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "Company [name=" + name + ", location=" + location + ", size=" + size + ", pincode=" + pincode + "]";
	}

	
	
}
