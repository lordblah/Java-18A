/*Create a class named Wedding for a wedding planner that includes the date of the wedding,
the names of the Couple being married, and a String for the location. Provide
constructors for each class that accept parameters for each field, and provide
get methods for each field.
*/
import java.time.LocalDate;
public class Wedding {
	private Couple weddingCouple;
	private LocalDate weddingDate;
	private String address;
	
	//constructor
	public Wedding(LocalDate weddingDate, Couple weddingCouple, String address) 
	{
		//sets parameter variables
		this.weddingDate= weddingDate;
		this.setWeddingCouple(new Couple(weddingCouple.getFirstPerson(), weddingCouple.getSecondPerson()));
		this.address = address;
		
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public LocalDate getWeddingDate() {
		return weddingDate;
	}

	public void setWeddingDate(LocalDate weddingDate) {
		this.weddingDate = weddingDate;
	}

	public Couple getWeddingCouple() {
		return weddingCouple;
	}

	public void setWeddingCouple(Couple weddingCouple) {
		this.weddingCouple = weddingCouple;
	}


	

}
