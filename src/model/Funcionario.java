package model;

public class Funcionario {
	
	private String nameEmployee;
	private double salaryEmployee;
	private int idEmployee;
	
	public Funcionario(String nameEmployee, double salaryEmployee, int idEmployee) {
		this.nameEmployee = nameEmployee;
		this.salaryEmployee = salaryEmployee;
		this.idEmployee = idEmployee;
	}

	public String getNameEmployee() {
		return nameEmployee;
	}

	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}

	public int getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	public double getSalaryEmployee() {
		return salaryEmployee;
	}

	@Override
	public String toString() {
		return 
	"Funcionario [nameEmployee="
	+ nameEmployee 
	+ ", salaryEmployee=" 
	+ salaryEmployee 
	+ ", idEmployee="
				
	+ idEmployee 
	+ "]";
	}
	
	
	

}
