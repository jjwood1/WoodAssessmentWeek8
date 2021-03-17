package Wood.beans;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
@Entity
@Table(name="car_table")
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="car_model")
	private String model;
	@Column(name="car_price")
	private double price;
	@Column(name="car_year")
	private int year;
	@Autowired
	private Company company;
	public Car()
	{
		super();
	}
	public Car(String model, double price, int year)
	{
		
		this.model = model;
		this.price = price;
		this.year = year;
	
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the company
	 */
	public Company getCompany() {
		return company;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", price=" + price + ", year=" + year + ", company=" + company
				+ "]";
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(Company company) {
		this.company = company;
	}
	
}
