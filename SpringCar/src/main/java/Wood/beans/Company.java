package Wood.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Company {
	private String name;
	private String country;
	
	public Company() {
		
	}
	public Company(String name, String country)
	{
		this.name = name;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", country=" + country + "]";
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
}
