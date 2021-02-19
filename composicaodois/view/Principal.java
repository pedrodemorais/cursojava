package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entitie.enums.WorkerLevel;
import entities.Department;
import entities.HourContract;
import entities.Worker;

public class Principal {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		HourContract contract;
		
		System.out.print("Enter department´s name: ");
		String department = input.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name:");
		String name = input.nextLine();
		System.out.print("Level:");
		String level = input.nextLine();
		System.out.print("Base salary:");
		Double baseSalary = input.nextDouble();
		input.nextLine();
		
		Worker worker = new Worker(name,WorkerLevel.valueOf(level), baseSalary, new Department(department));
		
		System.out.println("How many contracts to this Worker?");
		int numOfContract = input.nextInt();
		
		for(int i=0; i<numOfContract; i++) {
			input.nextLine();
			System.out.println("Enter contract #"+(i+1)+" data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			String data = input.nextLine();
			Date date = sdf.parse(data);
			System.out.print("Value per hour: ");
			Double valuePerHour = input.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = input.nextInt();
            
			HourContract hourContract = new HourContract(date, valuePerHour, hours);
			worker.addContract(hourContract);
		
		}
		System.out.print("Enter month and year to calculate income (MM/YYYY)");
		String monthAndYear = input.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: "+worker.getName());
		System.out.println("Department: "+worker.getDepartment().getName());
		System.out.println("Income for" +month+"/"+year+" : "+worker.income(month, year));

	}

}
