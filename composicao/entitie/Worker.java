package entitie;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entitie.enums.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department;
	
	//Quando  tem um relacionamento de um para N, a lista é iniciada vazia e não entra no 
	//no construtor a lista não pode entrar
	//ja instanciar a lista assim que a declarar
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
		
	}

	//Quando  tem um relacionamento de um para N, a lista é iniciada vazia e não entra no 
	//no construtor a lista não pode entrar
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	
	public void addContract(HourContract conctract) {
		contracts.add(conctract);
		
	}
	public void removeConctract(HourContract contract) {
		contracts.remove(contract);
	}
	
	//calcular a hora trabalhada de acordo com o mes e o ano
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		//Para cada Contrato c na lista Contracts
		for(HourContract c: contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if(year == c_year && month == c_month) {
			sum +=c.totalValue();
			}
		}
		return sum;
	}

	
	
}
