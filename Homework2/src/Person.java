import java.time.LocalDate;
//Person that holds the following fields: two String objects
//for the person’s first and last name and a LocalDate object for the person’s
//birthdate.
public class Person {
	private String firstName;
	private String lastName;
	private LocalDate birthdate;
	
	public Person(String firtName, String lasName , LocalDate birthdate)
	{
		setFirstName(firtName);
		setLastName(lasName);
		setBirthdate(birthdate);
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

}
