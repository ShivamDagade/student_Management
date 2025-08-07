package studentManagement;

import java.util.*;

public class StudentUtility {
	 static Scanner sc = new Scanner(System.in);
	//1.Add Student	
	public static Student addStudent() {
		
		Student s = new Student();
		System.out.print("Please enter Student ID : ");
		s.setSId(sc.nextInt());
		System.out.print("Please enter Student Name : ");
		s.setSName(sc.next());
		System.out.print("Please enter Student Age : ");
		s.setSAge(sc.nextInt());
		return s;
	}
	
	//2.Update Student
	public static void updateStudent(List<Student> students) {
		System.out.println("Please enter the update details : ");
		System.out.println("Enter SId : ");
		int id = sc.nextInt();
		int count = -1;
		int temp = 0;
		for(Student s : students) {
			if(id == s.getSId()) {
				count = temp;
				break;
			}
			temp++;
		}
		if(count < 0) {
			System.out.println("Student not found");
			return;
		}
		System.out.println("Enter SName : ");
		String name = sc.next();
		System.out.println("Enter SAge : ");
		int age = sc.nextInt();
		
		
		students.get(count).setSName(name);
		students.get(count).setSAge(age);
		System.out.println("Student Updated Successfully");
		
	}
	//3.Display Student
	public static void displayAllStudents(List<Student> students) {
		Iterator<Student> studentIterator= students.iterator();
		while(studentIterator.hasNext()) {
			System.out.println(studentIterator.next().toString());
		}
	}
	
	//4.Delete Student
	public  static void deleteStudent(List<Student>students, int sid) {
		Iterator<Student>studentIterator = students.iterator();
		int count = 0;
		while(studentIterator.hasNext()) {
			Student s = studentIterator.next();
			if(s.getSId()== sid) {
				studentIterator.remove();
				System.out.println("Student Deleted Successfully");
				return;
			}
			else {
				count++;
			}
		}
		if(count == students.size()) {
			System.out.println("Student not found");
		}
	}
}
