
package Program1;
import java.util.ArrayList;
public class StudentManagement {
	//static list of students 
	private static ArrayList<Student> students = new ArrayList<Student>();
	//initialize the total number of student
	private static int Tstudent=0;
	
	//static addstudent method with parameters to add students' information
	static void addstudent(int studentID, String name, int age, String grade) {
		//create an object to access/modify the variable from Student
		Student student=new Student(name, studentID, age, grade);
		//add the information in the list of student
		students.add(student);
		//add 1 to total students after adding a student
		Tstudent++;		
	}
	//static updatestudent method with parameters to update students' information
	static void updatestudent(int studentID,String name,int age, String grade) {
		// Iterate over the students using for loop
		for (Student student : students) {
			//if the id of the student that user want to modify is equal to the id of the student in the array list
            if (student.getStudentId() == studentID) {
            	//update the name, age, and grade
                student.setName(name); 
                student.setAge(age);
                student.setGrade(grade);
                break;
            }
            //if not, print the message
            else {
            	System.out.print("Students not found");
        }
    }
		
	}
	//static getStudentDetails method with parameters to view students' information
	public static Student getStudentDetails(int studentId) {
		// Iterate over the students using for loop
        for (Student student : students) {
        	//if the id of the student that user want to modify is equal to the id of the student in the array list
            if (student.getStudentId() == studentId) {
            //return the information of the student in the array list that the user searched by id 
                return student;
            }
          //if not, print the message
        else{
        	System.out.print("Students not found"); 
        }
        }
		return null;
    }


}
