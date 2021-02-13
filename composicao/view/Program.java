package view;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entitie.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		String department;
		String nameEmployee;
		WorkerLevel level;
		double baseSalary;
		int numContractsInput;
		Date date;
		
		System.out.print("Enter department's name: " );
		department=input.nextLine();
		System.out.println("Enter worker data: " );
		
		System.out.print("Level: " );
		//level = input.nextLine();

		System.out.print("Base Salary: " );
		baseSalary = input.nextDouble();
		
		System.out.print("How many contracts to this Work?" );
		numContractsInput = input.nextInt();
			
			for(int i=0; i<numContractsInput;i++) {
				System.out.println("Enter contract #"+(1+i)+" data: " );
				
				
			}
		System.out.println("Enter month and year to calculate income (MM/YYYY)");
		

	}

}
