/*Provide constructors for each class that accept parameters for each field, and provide
get methods for each field. Then write a program that creates two Wedding objects
and in turn passes each to a method that displays all the details.
 */
import java.time.LocalDate;

public class TestWedding 
{
	static int count = 1;
	public static void main(String[]args)
	{
		//date of birth of groom
		LocalDate groomDOB = LocalDate.of(1977, 5, 29);
		
		Person groom = new Person("James", "King", groomDOB);
		
		LocalDate brideDOB = LocalDate.of(1966, 5, 29);
		//instance of Person
		Person bride = new Person("Fran", "White", brideDOB);
		
		//new instance of couple
		
		Couple firstCouple = new Couple(groom,bride);
		
		//date of the wedding
		LocalDate weddingDate = LocalDate.of(2020, 6, 6);
		
		Wedding wedding1 = new Wedding(weddingDate, firstCouple, "Disney World");
		
		//output of wedding couple names, DOB,wedding date and location
		testDisplay(wedding1);
		
		//counter used to keep count of set of wedding couples
		count++;
		//Second couple test data
		LocalDate secondGroomDOB = LocalDate.of(1977, 5, 29);
		
		Person secondGroom = new Person("Jonathan", "Hernandez", secondGroomDOB);
		
		LocalDate secondBrideDOB = LocalDate.of(1966, 5, 29);
		
		Person SecondBride = new Person("Computer", "Science", secondBrideDOB);
		
		//new instance of couple
		
		Couple secondCouple = new Couple(secondGroom,SecondBride);
		
		//date of the wedding
		LocalDate weddingDateTwo = LocalDate.of(2020, 6, 6);
		
		Wedding wedding2 = new Wedding(weddingDateTwo, secondCouple, "Bell Lab");
		
		//output of wedding couple names, DOB,wedding date and location
		testDisplay(wedding2);
	}
	//Display function of test data for Wedding Class
	private static void testDisplay(Wedding wed)
	{
		
		System.out.println("The "+ count +" Groom name is " + wed.getWeddingCouple().getFirstPerson().getFirstName() + " " +
							wed.getWeddingCouple().getFirstPerson().getLastName());
		System.out.println("DOB:" + wed.getWeddingCouple().getFirstPerson().getBirthdate());
		System.out.println("The " + count + " Bride name is " + wed.getWeddingCouple().getSecondPerson().getFirstName() + " " +
				wed.getWeddingCouple().getSecondPerson().getLastName());
		System.out.println("DOB:" + wed.getWeddingCouple().getSecondPerson().getBirthdate());
		System.out.println("They wish to be married " + wed.getWeddingDate() + " at " + wed.getAddress() + "\n");
		
	}
}
