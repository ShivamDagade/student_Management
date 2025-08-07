package studentManagement;

import java.util.*;

public class StudentTest {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<Student>();
		int count = 0;
		while(true) {
			if(count!=0) {
				System.out.println("\n\nDo you want to continue, then press 'yes'");
				String continues = sc.next();
				if(continues.equalsIgnoreCase("yes")) {
					
				}
				else {
					System.exit(0);
				}
			}
			count++;
			System.out.println("\t\tStudent Project Management");
			System.out.println("========================================================");
			System.out.println("1.Add Student\n2.Update Student\n3.Display All Students\n4.Delete Student\n5.Exit\n");
			System.out.println("Please Select Operation : ");
			int option = sc.nextInt();
			//switch for particular operation
			switch(option) {
			case 1:
				Student student = StudentUtility.addStudent();
				studentList.add(student);
				System.out.println("Students Added Successfully.");
				break;
			case 2:
				StudentUtility.updateStudent(studentList);
				break;
			
			case 3:
				StudentUtility.displayAllStudents(studentList);
				break;
			case 4:
				System.out.println("Enter the student id to delete student : ");
				int sid = sc.nextInt();
				StudentUtility.deleteStudent(studentList, sid);
				break;
			
			case 5:
				System.exit(0);break;
				
			default:
				System.err.println("Please enter correct option?");

			}
			
		}
	}
	
}
