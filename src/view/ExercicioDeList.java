package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitie.Employee;

public class ExercicioDeList {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		
		List<Employee> list = new ArrayList<>();

		String nameEmployee = "";
		Employee employee = null;
		Employee emp = null;

		double salaryEmployee = 0.0;

		int idEmployee = 0;

		float percentualAAumentar = 0f;
		

		
		System.out.println("Quantos Funcionários serão cadastrados?");
		int qtdFuncionarios = input.nextInt();

		for (int i = 0; i < qtdFuncionarios; i++) {

			input.nextLine();

			System.out.println("Código do Funcionário: ");
			idEmployee = input.nextInt();
			
			while(hasid(list, idEmployee)) {
				System.out.println("Já existe um Funcionário com esse código, digite novamente: ");
				idEmployee = input.nextInt();
				
			}

			System.out.println("Nome Funcionário: ");
			input.nextLine();
			nameEmployee = input.nextLine();

			System.out.println("Salário do Funcionário: ");
			salaryEmployee = input.nextDouble();

			employee = new Employee(nameEmployee, salaryEmployee, idEmployee);
			list.add(employee);

		}

		for (Employee x : list) {

			System.out.println(x);
		}

		System.out.println("Digite o código do Funcionário que receberá aumento: ");
		int idSalary = input.nextInt();
		
		emp = list.stream().filter(x -> x.getIdEmployee() == idSalary).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("Código Inválido!");
		}else { 

			System.out.println("Funcionário Encontrado!");
		
			System.out.println("Qual o pecentual de aumento do salario do funcionário?");
			percentualAAumentar = input.nextFloat();
			emp.aumentarSalario(percentualAAumentar);;
			//employee.aumentarSalario(percentualAAumentar);

			System.out.println("");
		
			System.out.println("Qual o pecentual de aumento do salario do funcionário?");
			percentualAAumentar = input.nextFloat();
			employee.aumentarSalario(percentualAAumentar);

			
		
		}

		
		for(Employee x: list) {
			System.out.println(x);
		}

		
		input.close();

	}
	
	static boolean hasid(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getIdEmployee()==id).findFirst().orElse(null);
		
		return emp != null;
		
	}
}
