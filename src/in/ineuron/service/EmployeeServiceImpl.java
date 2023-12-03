package in.ineuron.service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import in.ineuron.bo.EmployeeBO;
import in.ineuron.dao.IEmployeeDAO;
import in.ineuron.dto.EmployeeDTO;
import in.ineuron.vo.EmployeeVO;



@Service(value = "empService")
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeDAO dao;
	
	static {
		System.out.println("EmployeeServiceImpl.class file loading...");
	}
	
	public EmployeeServiceImpl(){
		System.out.println("EmployeeServiceImpl: 0 param constructor...");
	}
	
	@Override
	public EmployeeDTO calculateHike(EmployeeDTO dto) {
		
		EmployeeBO bo = new EmployeeBO();
		
		//copying the common props from dto to bo::
		BeanUtils.copyProperties(dto, bo);
		bo.setHikeAmt(dto.getEsalary() + 30000.0f);
		
		EmployeeBO empBO = dao.save(bo);
		
		EmployeeDTO emDTO = new EmployeeDTO();
		BeanUtils.copyProperties(empBO, emDTO);
		return emDTO;
	}

	@Override
	public String toString() {
		return "EmployeeServiceImpl [dao=" + dao + "]";
	}
	
}
