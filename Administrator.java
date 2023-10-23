package Program1;
import java.util.Scanner;
public interface Administrator {
	public static void main(String[] args) {
		//as long as the condition is true
		while (true) {
		//create a scanner
        Scanner user = new Scanner(System.in);
        //Show the options
        System.out.println("Menu of Administration");
        System.out.println("1. Add new student");
        System.out.println("2. Update student information");
        System.out.println("3. View student details");
        System.out.println("4. Exit");
        System.out.println("Enter an option");
        //Read the input from user
        int  userInput = user.nextInt(); 
        
        switch(userInput) {
        //when the user choose the option1
        case 1:
        	// User need to enter name, id, age and grade to add new student
        	 System.out.print("Enter student name: ");
             String name = user.next();
             System.out.print("Enter student ID: ");
             int studentID = user.nextInt();
             System.out.print("Enter student age: ");
             int age = user.nextInt();
             System.out.print("Enter student grade: ");
             //to read the user input
             String grade = user.next();
             //to access addstudent method of StudentManagement
             StudentManagement.addstudent( studentID, name,  age,  grade);
             //print the message
             System.out.print("Added New Students Successfully! \n");
          break;
        //when the user choose the option2
        case 2:
        	//Ask the id of the student that user want to update
        	System.out.print("Enter student ID to update: ");
        	//to read the user input
            int updateId = user.nextInt();
            //the user input enter as parameters of getStudentDetails method of StudentManagement and assign to Updatestudent 
            Student Updatestudent = StudentManagement.getStudentDetails(updateId);
            //if the Updatestudent is not equal to null
            if (Updatestudent!=null) {
            //ask the name, age, grade of the student form user
        	System.out.print("Enter student name: ");
            String new_name = user.next();
            System.out.print("Enter student age: ");
            int new_age = user.nextInt();
            System.out.print("Enter student grade: ");
            String new_grade = user.next();
            //update the name, age, grade by using user input id and updatestudent method of StudentManagement
          StudentManagement.updatestudent(updateId, new_name, new_age, new_grade);
          System.out.print("Updated Successfully \n"); }
            //if the id that user input is equal to null, print the message
            else{
            	System.out.print("Students not found");
            }
          break;
           
          
         //when the user choose the option3  
        case 3:   
        	//Ask the id of the student that user want to view
          System.out.print("Enter student ID to view details: ");
          int viewId = user.nextInt();
          //the user input enter as parameters of getStudentDetails method of StudentManagement and assign to View
          Student View = StudentManagement.getStudentDetails(viewId);
        //if the View is not equal to null
          if (View != null) {
        	  //output the details of the id that user want to view
              System.out.println("Student Details:");
              System.out.println("Name: " + View.getName());
              System.out.println("Student ID: " + View.getStudentId());
              System.out.println("Age: " + View.getAge());
              System.out.println("Grade: " + View.getGrade());
          } 
          //if not, print the message
          else {
              System.out.println("Student not found.");
          }
          break;
          
      //when the user choose the option4  
      case 4:
          //print the message and quit the program 
          user.close();
          System.out.println("Exit successfully!! \n");
          System.exit(0);
          
          break;
          //when the user choose the invalid option, print the message     
      default:
          System.out.println("Invalid option. Please try again.");
          break;
  }

}
}
}