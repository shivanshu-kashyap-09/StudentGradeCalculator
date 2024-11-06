package studentGradeCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a student name : ");
		String studentName = scan.nextLine();
		
		System.out.print("Enter the total number of subjects : ");
		int totalSub = scan.nextInt();
		
		String subName[] = new String[totalSub];
		int subMarks[] = new int[totalSub];
		
		for(int i = 0 ; i < totalSub ; i++) {
			System.out.print("Enter the subject name : ");
			subName[i] = scan.next();
			System.out.print("Enter the "+subName[i]+" marks : ");
			subMarks[i] = scan.nextInt();
		}
		
		int totalMarks = 0;
		for(int i = 0 ; i < totalSub ; i++) {
			totalMarks += subMarks[i];
		}
		
		double avgPer = (double) totalMarks / totalSub;
		char grade;
		
		if(avgPer >= 80) {
			grade = 'A';
		}else if(avgPer >= 70) {
			grade = 'B';
		}else if(avgPer >= 50) {
			grade = 'C';
		}else if(avgPer >= 40) {
			grade = 'D';
		}else if(avgPer >= 33) {
			grade = 'E';
		}else {
			grade = 'F';
		}
		
		System.out.println("----Result----");
		System.out.println("total Marks : "+totalMarks);
		System.out.println("Average percentage : "+avgPer+"%");
		System.out.println("Grade : "+grade);
	}

}
