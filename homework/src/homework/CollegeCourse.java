package homework;
/*CollegeCourse class 
 * 
 */
public class CollegeCourse {
	private String department;
	private int courseNum;
	private int classCredits;
	private int courseFee;
	
	public CollegeCourse(String dept, int courseN, int classCred) {
		setDepartment(dept);
		setCourseNum(courseN);
		setClassCredits(classCred);
		setCourseFee(120 * classCred);
	}
	public void display() {
		System.out.println("College Department:" + getDepartment());
		System.out.println("Course Number" + getCourseNum());
		System.out.println("Class Credit:" +  getClassCredits());
		System.out.println("Course Fee:" + getCourseFee());
	}
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(int courseNum) {
		this.courseNum = courseNum;
	}

	public int getClassCredits() {
		return classCredits;
	}

	public void setClassCredits(int classCredits) {
		this.classCredits = classCredits;
	}

	public int getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}
}
