package assignment3;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Number of students: ");
		int noOfStudents = scan.nextInt();
		
		int[] studentId = new int[noOfStudents];
		String[] studentName = new String[noOfStudents];
		double[] studentFee = new double[noOfStudents];
		String[] studentSection = new String[noOfStudents];
		
		for(int i=0; i<noOfStudents; i++){
			int c = i+1;
			System.out.println("Enter student " + c + " id:");
			studentId[i] = scan.nextInt();
			System.out.println("Enter student " + c + " name");
			studentName[i] = scan.next();
			System.out.println("Enter student " + c + " Fee");
			studentFee[i] = scan.nextDouble();
			System.out.println("Enter student " + c + " Section");
			studentSection[i] = scan.next();	
		}
		
		System.out.println("Enter Section that you want to see the result");
		String stringinput = new String();
		stringinput = scan.next();
		for(int i=0; i<noOfStudents;i++){
			if(studentSection[i].equals(stringinput)){
				System.out.println("ID   "+ " NAME    "+ " FEE  "+" Section ");
				System.out.println(studentId[i] + "   "+studentName[i]+ "   "+ studentFee[i] + "   "+ studentSection[i]);
			}
		}
		
		scan.close();
	}

}
