package in.ineuron.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import in.ineuron.dto.EmployeeDTO;
import in.ineuron.service.IEmployeeService;
import in.ineuron.vo.EmployeeVO;



@Controller(value = "controller")
public class MainController {
	
	@Autowired
	private IEmployeeService service;

	static {
		System.out.println("MainController.class file is being created...");
	}
	
	public MainController() {
		System.out.println("MainController:: Zero param constructor is being created...");
	}
	
	
	public EmployeeVO getHike(EmployeeVO vo) {
		
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEname(vo.getEname());
		dto.setEage(Integer.parseInt(vo.getEage()));
		dto.setEaddress(vo.getEaddress());
		dto.setEsalary(Float.parseFloat(vo.getEsalary()));
		
		EmployeeDTO empDTO = service.calculateHike(dto);
		
		EmployeeVO empVO = new EmployeeVO();
		empVO.setEid(String.valueOf(empDTO.getEid()));
		empVO.setEname(empDTO.getEname());
		empVO.setEage(String.valueOf(empDTO.getEage()));
		empVO.setEaddress(empDTO.getEaddress());
		empVO.setEsalary(String.valueOf(empDTO.getEsalary()));
		empVO.setHikeAmt(String.valueOf(empDTO.getHikeAmt()));
		
		return empVO;
	}
	

	@Override
	public String toString() {
		return "MainController [service=" + service + "]";
	}
	
}
