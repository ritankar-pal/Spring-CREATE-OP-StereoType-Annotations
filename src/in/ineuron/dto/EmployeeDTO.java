package in.ineuron.dto;                                                                                                                                
                                                                                                                                                       
public class EmployeeDTO {                                                                                                                             
	                                                                                                                                                   
	private Integer eid;                                                                                                                               
	private String ename;                                                                                                                              
	private Integer eage;                                                                                                                              
	private String eaddress;                                                                                                                           
	private Float esalary;                                                                                                                             
	private Float hikeAmt;                                                                                                                             
	
                                                                                                                                                       
	public Float getEsalary() {                                                                                                                        
		return esalary;                                                                                                                                
	}                                                                                                                                                  
                                                                                                                                                       
	public void setEsalary(Float esalary) {                                                                                                            
		this.esalary = esalary;                                                                                                                        
	}                                                                                                                                                  
                                                                                                                                                       
	public Float getHikeAmt() {                                                                                                                        
		return hikeAmt;                                                                                                                                
	}                                                                                                                                                  
                                                                                                                                                       
	public void setHikeAmt(Float hikeAmt) {                                                                                                            
		this.hikeAmt = hikeAmt;                                                                                                                        
	}                                                                                                                                                  
	                                                                                                                                                   
	public Integer getEid() {                                                                                                                          
		return eid;                                                                                                                                    
	}                                                                                                                                                  
                                                                                                                                                       
	public void setEid(Integer eid) {                                                                                                                  
		this.eid = eid;                                                                                                                                
	}                                                                                                                                                  
                                                                                                                                                       
	public String getEname() {                                                                                                                         
		return ename;                                                                                                                                  
	}                                                                                                                                                  
                                                                                                                                                       
	public void setEname(String ename) {                                                                                                               
		this.ename = ename;                                                                                                                            
	}                                                                                                                                                  
                                                                                                                                                       
	public Integer getEage() {                                                                                                                         
		return eage;                                                                                                                                   
	}                                                                                                                                                  
                                                                                                                                                       
	public void setEage(Integer eage) {                                                                                                                
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
		return "EmployeeDTO [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", eaddress=" + eaddress
				+ ", esalary=" + esalary + ", hikeAmt=" + hikeAmt + "]";
	}
                                                                                                                                                       
}                                                                                                                                                      
                                                                                                                                                       