package Wood;
/**
 * @author Joshua Wood - jjwood1
 * CIS175 - Spring 2021
 * Mar 17, 2021
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import Wood.beans.Car;
import Wood.beans.Company;

import Wood.controller.BeanConfiguration;
import Wood.repository.CarRepository;
@SpringBootApplication
public class SpringCarApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringCarApplication.class, args);
	}
	@Autowired
	CarRepository repo;
	@Override
	public void run(String... args) throws Exception {

		ApplicationContext appContext = new 
				AnnotationConfigApplicationContext(BeanConfiguration.class);

		Car c = appContext.getBean("car", Car.class);
	

		Car car = new Car("Focus", 5000.00, 2011);
		Company company = new Company("Ford", "USA");
		car.setCompany(company);
		repo.save(car);
		List<Car> cars = repo.findAll();
		for(Car curCar: cars) {
			System.out.println(curCar.toString());
		}
		((AbstractApplicationContext) appContext).close();
		}
}
