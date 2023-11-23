package in.ineuron;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import in.ineuron.service.ICoronaVaccineMgmtService;

@SpringBootApplication
public class DaoSpringDataJpa01Application {

	public static void main(String[] args) {
		ApplicationContext factory = SpringApplication.run(DaoSpringDataJpa01Application.class, args);
		ICoronaVaccineMgmtService service = factory.getBean(ICoronaVaccineMgmtService.class);
/*
		service.fetchDetails(false, "price", "name").forEach((vaccine) -> {
			System.out.println(vaccine.getRegNo() + "--" + vaccine.getName() + "--" + vaccine.getPrice());
		});
*/
		
		
/*		
		service.fetchDetailsByPageNo(1, 4, true, "price","name").forEach((vaccine)->{
			System.out.println(vaccine.getName()+" "+vaccine.getPrice());
		});
*/
		
		service.fetchDetailsByPagenation(2);
		

	}
}
