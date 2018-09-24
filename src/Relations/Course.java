package Relations;

public class Course {
	private String courseCode;
	private String courseName;
	private String description;
	private int credit;

	public Course(String courseCode, String courseName, String description, int credit) {

	setCourseCode(courseCode);
	setCourseName(courseName);
	setDescription(description);
	setCredit(credit);
	}

	public void setCourseCode(String courseCode) {
	    this.courseCode = courseCode;
	}

	public String getCourseCode() {
	    return courseCode;
	}

	public void setCourseName(String courseName) {
	    this.courseName = courseName;
	}

	public String getCourseName() {
	    return courseName;
	}

	public void setDescription(String description) {
	    this.description = description;
	}

	public String getDescription() {
	    return description;
	}

	public void setCredit(int credit) {
	    this.credit = credit;
	}

	public int getCredit() {
	    return credit;
	} }



