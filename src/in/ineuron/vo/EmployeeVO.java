package in.ineuron.vo;

public class EmployeeVO {
	
	private String eid;
	private String ename;
	private String eage;
	private String eaddress;
	private String esalary;
	private String hikeAmt;
	
	public String getEsalary() {
		return esalary;
	}

	public void setEsalary(String esalary) {
		this.esalary = esalary;
	}

	public String getHikeAmt() {
		return hikeAmt;
	}

	public void setHikeAmt(String hikeAmt) {
		this.hikeAmt = hikeAmt;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEage() {
		return eage;
	}

	public void setEage(String eage) {
		this.eage = eage;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	@Override
	public String toString() {
		return "EmployeeVO [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", eaddress=" + eaddress
				+ ", esalary=" + esalary + ", hikeAmt=" + hikeAmt + "]";
	}
	
}
