package in.ineuron.vo;

public class EmployeeVo {
	
	private String slNo;
	private String empNo;
	private String empName;
	private String job;
	private String sal;
	private String deptNo;
	private String managerNo;
	
	
	public String getSlNo() {
		return slNo;
	}
	public void setSlNo(String slNo) {
		this.slNo = slNo;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getManagerNo() {
		return managerNo;
	}
	public void setManagerNo(String managerNo) {
		this.managerNo = managerNo;
	}
	@Override
	public String toString() {
		return "EmployeeVo [slNo=" + slNo + ", empNo=" + empNo + ", empName=" + empName + ", job=" + job + ", sal="
				+ sal + ", deptNo=" + deptNo + ", managerNo=" + managerNo + "]";
	}
	
	

}
