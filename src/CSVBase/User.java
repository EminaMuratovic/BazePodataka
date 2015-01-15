package CSVBase;

public class User {
	private String name;
	private String lastName;
	private int years;
	private boolean driverLicense;

	/**
	 * creates user
	 * @param name String name of the user
	 * @param lastName String last name of the user
	 * @param years int how old is user
	 * @param driverLicense boolean checks if the user has driver license
	 */
	public User(String name, String lastName, int years, boolean driverLicense) {
		this.name = name;
		this.lastName = lastName;
		this.years = years;
		this.driverLicense = driverLicense;
	}

	/**
	 * gets the name of the user
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * sets the name of the user
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * gets the last name of the user
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * sets the last name of the user
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * gets the years of the user
	 * @return the years
	 */
	public int getYears() {
		return years;
	}

	/**
	 * sets the years of the user
	 * @param years the years to set
	 */
	public void setYears(int years) {
		this.years = years;
	}

	/**
	 * checks if the user has driver license
	 * @return the driverLicense
	 */
	public boolean isDriverLicense() {
		return driverLicense;
	}

	/**
	 * sets the user driver license
	 * @param driverLicense the driverLicense to set
	 */
	public void setDriverLicense(boolean driverLicense) {
		this.driverLicense = driverLicense;
	}
	
	/**
	 * creates a string from the user 
	 * @param delimeter String object that we use for separating parameters of the user
	 * @return string
	 */
	public String toCSVString(String delimeter) {
		String str = "";
		str +=  name + delimeter + lastName + delimeter;
		str +=  years + delimeter + driverLicense;
		return str;
	}
	

}
