package ExampleSpring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmpAppCon {
		public static void main(String args[]) {
			
			Employee e=new Employee(); //general java code
			e.setEid(110);
			e.setEname("Nikii");
			e.setEsalary(560000);
			
			System.out.println(e);
			
			//using IOC
	ApplicationContext context=new ClassPathXmlApplicationContext("EmployeeBean.xml");
	Employee e1=(Employee)context.getBean("emp1");
	Employee e2=(Employee)context.getBean("emp2");
	
	System.out.println(e1);
	System.out.println(e2);
		}
}
