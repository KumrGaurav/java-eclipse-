import java.util.*;
class SampleStudent{
	String name;
	int age;
	SampleStudent(String studentName,int studentAge)
	{
		this.name = studentName;
		this.age = studentAge;
		
	}
}
public class Student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SampleStudent[] students;
		students = new SampleStudent[3];
		for(int i=0; i<3; i++)
		{
			System.out.println("Enter Student name :-");
			String name = sc.nextLine();
			System.out.println("Enter student age :->");
			int age = sc.nextInt();
			sc.nextLine();
			students[i] = new SampleStudent(name,age);
			
		}
		sc.close();
		for(int i=0;i<students.length;i++)
		{
			SampleStudent student = students[i];
			System.out.println("Student name :- "+student.name);
			System.out.println("Student age :- "+student.age);
		}
		
	}

}
