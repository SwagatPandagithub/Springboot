package in.ineuron.dto;

public class EmployeeDto {
	
	private Integer empNo;
	private String empName;
	private String job;
	private Double sal;
	private Integer deptNo;
	private Integer managerNo;
	
	
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
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
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	public Integer getManagerNo() {
		return managerNo;
	}
	public void setManagerNo(Integer managerNo) {
		this.managerNo = managerNo;
	}
	@Override
	public String toString() {
		return "EmployeeBo [empNo=" + empNo + ", empName=" + empName + ", job=" + job + ", sal=" + sal + ", deptNo="
				+ deptNo + ", managerNo=" + managerNo + "]";
	}
	
		

	
	

}
