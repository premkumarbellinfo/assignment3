package assignment3;

import java.util.Scanner;


public class Program3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Number of students: ");
		int noOfStudents = scan.nextInt();
		
		StudentDetails[] students = new StudentDetails[noOfStudents];
		for(int i=0; i<noOfStudents; i++){
			int c = i+1;
			
			System.out.println("Enter student "+c +" id");
			int studentId = scan.nextInt();
			System.out.println("Enter student " + c + " name");
			String studentName = scan.next();
			System.out.println("Enter student " + c + " Fee");
			double studentFee = scan.nextDouble();
			System.out.println("Enter student " + c + " Section");
			String studentSection = scan.next();
			
			StudentDetails a = new StudentDetails(studentId,studentName,studentFee,studentSection);
			students[i] = a;
		}
		
		
		System.out.println("ID   "+ " NAME    "+ " FEE  "+" Section ");
		for(int i=0; i<noOfStudents;i++){
			System.out.println(students[i].getId() + "   "+students[i].getName()+ "   "+ students[i].getFee() + "   "+ students[i].getSection());
		}
		
		scan.close();
		
	}

}

class StudentDetails{
	private int id;
	private String name;
	private double fee;
	private String section;

	
	StudentDetails(){
		
	}


	public StudentDetails(int id, String name, double fee, String section) {
		
		this.id = id;
		this.name = name;
		this.fee = fee;
		this.section = section;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getFee() {
		return fee;
	}


	public void setFee(double fee) {
		this.fee = fee;
	}


	public String getSection() {
		return section;
	}


	public void setSection(String section) {
		this.section = section;
	}


	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", name=" + name + ", fee=" + fee
				+ ", section=" + section + "]";
	}
	
	
	
	
	
	
	
}	