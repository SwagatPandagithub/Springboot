package in.ineuron;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.ineuron.bo.CoronaVaccine;
import in.ineuron.service.ICoronaVaccineMgmtService;

@SpringBootApplication
public class DaoSpringDataJpa01Application {

	public static void main(String[] args) {
		ApplicationContext factory = SpringApplication.run(DaoSpringDataJpa01Application.class, args);
		ICoronaVaccineMgmtService service = factory.getBean(ICoronaVaccineMgmtService.class);
		
		
		
	service.fetchDetails(false, "price","name").forEach((vaccine)->{
		System.out.println(vaccine.getRegNo()+"--"+vaccine.getName()+"--"+vaccine.getPrice());
	});
	
	}
}
