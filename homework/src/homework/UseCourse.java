
package homework;
import java.util.*;
public class UseCourse {
	public static void main(String[] args)
	{
		//create a lab course 
		String userDeptChoise;
		int userCourseNum;
		int userClassCredits;
		int userCourseFee;
		boolean inputCheckForLab = true;
		do {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter class course in the form of three letters. Example"
					+ " CHI,PHY,MAT");
			System.out.println("Enter class course:");
			userDeptChoise = keyboard.nextLine();
			
			//if not a lab its goign to break out of loop,
			//if it is a lab it will run
			switch(userDeptChoise) {
			case "BIO":
			case "CHM":
			case "CIS":
			case "PHY":
				System.out.println("Enter class Course Number:");
				userCourseNum = keyboard.nextInt();
				
				System.out.println("Enter Class Course Credits:");
				userClassCredits = keyboard.nextInt();
				System.out.println("Enter class course fee:");
				userCourseFee = keyboard.nextInt(); 
				LabCourse lab = new LabCourse(userChoise,userCourseNum);
			}
		}while(inputCheckForLab);
	}
}
