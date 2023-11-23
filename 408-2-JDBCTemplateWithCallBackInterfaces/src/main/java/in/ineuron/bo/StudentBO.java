package in.ineuron.bo;

public class StudentBO {
	
	private int studId;
	private String studName;
	private String studAddress;
	private int studAge;

	@Override
	public String toString() {
		return "StudentBO [studId=" + studId + ", studName=" + studName + ", studAddress=" + studAddress + ", studAge="
				+ studAge + "]";
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudAddress() {
		return studAddress;
	}

	public void setStudAddress(String studAddress) {
		this.studAddress = studAddress;
	}

	public int getStudAge() {
		return studAge;
	}

	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}
	

}
