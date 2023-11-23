package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.ineuron.DTO.StudentDTO;
import in.ineuron.service.ServiceImpl;
import in.ineuron.service.ServiceInterface;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		ServiceInterface service = applicationContext.getBean(ServiceInterface.class);
		
		StudentDTO dto = service.fetchStudentByNo(63);
		System.out.println(dto);
	}

}
