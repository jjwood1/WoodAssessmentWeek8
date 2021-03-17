package Wood.controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import Wood.beans.*;
public class BeanConfiguration {
	@Bean
	public Car car() {
		Car bean = new Car();
		return bean;
	}
	@Bean
	public Company company()
	{
		Company bean = new Company("Ford", "USA");
		return bean;
	}
}
