package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.ineuron.comp.Employee;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		Employee emp = SpringApplication.run(Application.class, args).getBean(Employee.class);
		System.out.println(emp);
	}

}
