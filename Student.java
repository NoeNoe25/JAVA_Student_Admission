package Program1;

public class Student {
	//private instance variables to store student information such as name, ID, age, and grade.
	private String name;
	private int studentID;
	private int age;
	private String grade;
	
	
	// Constructor with parameters 
	 public Student(String name, int studentID, int age, String grade) {
	        this.name = name;
	        this.studentID = studentID;
	        this.age = age;
	        this.grade = grade;
	    }

	    // Public getter and setter methods for accessing/updating student information
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getStudentId() {
	        return studentID;
	    }

	    public void setStudentId(int studentID) {
	        this.studentID = studentID;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getGrade() {
	        return grade;
	    }

	    public void setGrade(String grade) {
	        this.grade = grade;
	    }
	}