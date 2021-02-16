package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entitie.Department;
import entitie.HourContract;
import entitie.Worker;
import entitie.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		String departmentName;
		String workName;
		String workLevel;
		String monthAndYear;
		double baseSalary;
		double valuePerHour;
		int numContractsInput;
		int hours;
		int month;
		int year;
		Date date;

		System.out.print("Enter department's name: ");
		departmentName = input.nextLine();
		System.out.println("Enter worker data: ");

		System.out.print("Name: ");
		workName = input.nextLine();

		System.out.print("Level: ");
		workLevel = input.nextLine();

		System.out.print("Base Salary: ");
		baseSalary = input.nextDouble();

		Worker worker = new Worker(workName, WorkerLevel.valueOf(workLevel), baseSalary, new Department(departmentName));

		System.out.print("How many contracts to this Work?");
		numContractsInput = input.nextInt();

		for (int i = 0; i < numContractsInput; i++) {
			System.out.println("Enter contract #" + (1 + i) + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(input.next());
			System.out.print("Value per Hour: ");
			valuePerHour = input.nextDouble();
			System.out.print("Duration (Hours): ");
			hours = input.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			//IMPORTANTE - aqui se faz o link com a classe trabalhador com o contrato
			worker.addContract(contract);

		}
		System.out.println("Enter month and year to calculate income (MM/YYYY)");
		monthAndYear = input.next();
		month = Integer.parseInt(monthAndYear.substring(0, 2));
		year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: "+worker.getName());
		System.out.println("Department: "+worker.getDepartment().getName());
		System.out.println("Income for "+ monthAndYear+": "+ String.format("%.2f",worker.income(year, month)));
		input.close();

	}

}
