import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.service.EmployeeService;


public class ClientTest {

	
	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resources/beans.xml");
		
		EmployeeService service = context.getBean("employeeService", EmployeeService.class);
		service.setEmpName("vishal");
		System.out.println(""+service.getEmpName());
		
		
		
	}
}
