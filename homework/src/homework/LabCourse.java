package homework;

public class LabCourse extends CollegeCourse{
	private int labfee;
	
	public LabCourse(String dept, int courseN, int classCred) {
		super(dept, courseN, classCred);
		// TODO Auto-generated constructor stub
		labfee = 
	}
	public int getLabfee() {
		return labfee;
	}
	public void setLabfee() {
		
		this.labfee = labfee + getCourseFee();
	}
	
	@Override
	public void display()
	{
		System.out.println("THis is a lab couse so there wil be a added $50 fee");
		System.out.println("College Department:" + getDepartment());
		System.out.println("Course Number" + getCourseNum());
		System.out.println("Class Credit:" +  getClassCredits());
		System.out.println("Course Fee:" + getLabfee());
	}

}
