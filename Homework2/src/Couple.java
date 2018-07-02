/*Provide constructors for each class that accept parameters for each field, and provide
get methods for each field.
 * 
 */
public class Couple {
	//create two person objects
	private Person firstPerson;
	private Person secondPerson;
	
	
	public Couple( Person firPerson, Person secPerson)
	{
		setFirstPerson(new Person(firPerson.getFirstName(), firPerson.getLastName(), firPerson.getBirthdate()));
		setSecondPerson(new Person(secPerson.getFirstName(), secPerson.getLastName(), secPerson.getBirthdate()));
	}

	public Person getFirstPerson() {
		return firstPerson;
	}


	public void setFirstPerson(Person firstPerson) {
		this.firstPerson = firstPerson;
	}


	public Person getSecondPerson() {
		return secondPerson;
	}


	public void setSecondPerson(Person secondPerson) {
		this.secondPerson = secondPerson;
	}


}
