package in.ineuron.comp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "emp.info")
public class Employee {
	
	
	
	private String name;
	private String id;	
	private String[] skills;	
	private List<String> teamMembers;
	private Set<Long> phoneNumbers;
	private Map<String, String> idDetails;
	
	public void setCompany(Company company) {
		this.company = company;
	}

	//Has A relationship
	private Company company;
	
	public void setIdDetails(Map<String, String> idDetails) {
		this.idDetails = idDetails;
	}

	public void setPhoneNumbers(Set<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public void setTeamMembers(List<String> teamMembers) {
		this.teamMembers = teamMembers;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", \nid=" + id + ", \nskills=" + Arrays.toString(skills) + ", \nteamMembers="
				+ teamMembers + ", \nphoneNumbers=" + phoneNumbers + ", \nidDetails=" + idDetails + ",\ncompany=" + company
				+ "]";
	}

	
	

}
