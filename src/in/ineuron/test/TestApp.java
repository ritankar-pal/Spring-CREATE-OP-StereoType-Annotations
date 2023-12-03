package in.ineuron.test;
import java.io.Closeable;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.ineuron.cfg.AppConfig;
import in.ineuron.controller.MainController;
import in.ineuron.vo.EmployeeVO;


public class TestApp {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter ename:: ");
		String ename = scan.next();
		
		System.out.print("Enter eage:: ");
		String eage = scan.next();
		
		System.out.print("Enter eaddress:: ");
		String eaddress = scan.next();
		
		System.out.print("Enter esalary:: ");
		String esalary = scan.next();
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		MainController controller = context.getBean(MainController.class);
		
		EmployeeVO employeeVO = new EmployeeVO();
		employeeVO.setEname(ename);
		employeeVO.setEage(eage);
		employeeVO.setEaddress(eaddress);
		employeeVO.setEsalary(esalary);
		
		//Sending employeeVo to the service layer::
		EmployeeVO result = controller.getHike(employeeVO);
		System.out.println(result);
		
		
		((AbstractApplicationContext) context).close();
		((Closeable) context).close();
		scan.close();
		
	}

}
